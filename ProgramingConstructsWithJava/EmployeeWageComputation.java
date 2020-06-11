import java.io.*;
import java.util.Scanner;

class Employee{
    public int WagePerHour;
    public int HoursPerDay;
    public int PartTimeHours;

    public int WagePerDay;
    public int TotalWageForMonth;
    public int TotalWorkingHours;
    public int FullWorkingDays;
    public int PartTimeWorkingDays;
    public int AbsentDays;

    public Employee(){
        WagePerHour=20;
        HoursPerDay=8;
        PartTimeHours=4;

        WagePerDay=0;
        TotalWageForMonth=0;
        TotalWorkingHours=0;
        FullWorkingDays=0;
        PartTimeWorkingDays=0;
        AbsentDays=0;
    }

    public int CalculateAttendance(){
        return (int)(Math.random()*3);
    }

    public void CalculateWagePerDay(){
        int EmployeeAttendance=CalculateAttendance();
        switch(EmployeeAttendance){
            case 0:this.WagePerDay=0;
                this.TotalWorkingHours+=0;
                this.AbsentDays++;
                //System.out.println("Employee is absent. Salary for the day: "+this.WagePerDay);
                break;
            case 1:this.WagePerDay=this.WagePerHour*this.HoursPerDay;
                this.TotalWorkingHours+=this.HoursPerDay;
                this.FullWorkingDays++;
                //System.out.println("Employee is present. Salary for the day: "+this.WagePerDay);
                break;
            case 2:this.WagePerDay=this.WagePerHour*this.PartTimeHours;
                this.TotalWorkingHours+=this.PartTimeHours;
                this.PartTimeWorkingDays++;
                //System.out.println("Employee is present and working part-time. Salary for the day: "+this.WagePerDay);
                break;
            default:
                System.out.println("Error Occurred");
        }
    }

    public void CalculateWagePerMonth(){
        for(int day=1;day<=20;day++){
            while(this.TotalWorkingHours<100){
                //System.out.println("Day: "+day);
                CalculateWagePerDay();
                this.TotalWageForMonth+=this.WagePerDay;
                break;
            }
        }
    }

    public int getTotalWageForMonth() {
        return TotalWageForMonth;
    }

    public int getTotalWorkingHours() {
        return TotalWorkingHours;
    }

    public int getFullWorkingDays() {
        return FullWorkingDays;
    }

    public int getPartTimeWorkingDays() {
        return PartTimeWorkingDays;
    }

    public int getAbsentDays() {
        return AbsentDays;
    }
}

public class EmployeeWageComputation {
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Please entr the number of employees for calculating wage of the month");
        int NumberOfEmployees=scanner.nextInt();

        File f=new File("EmployeeList.txt");
        FileWriter fw=new FileWriter(f,true);
        PrintWriter pw1=new PrintWriter(fw);

        String EmployeeName;
        for(int i=0;i<NumberOfEmployees;i++){
            System.out.println("Enter the name of the Employee");
            EmployeeName=scanner.next();
            pw1.println(EmployeeName);
        }

        pw1.flush();
        pw1.close();

        BufferedReader br =new BufferedReader(new FileReader(f));
        PrintWriter pw2=new PrintWriter("EmployeeWageDetailsList.txt");

        String input=br.readLine();
        while(input != null){
            pw2.println(input);
            Employee newEmployee=new Employee();
            newEmployee.CalculateWagePerMonth();
            pw2.println("Total Wage Earned at the end of 20 days/100 hours: "+newEmployee.getTotalWageForMonth() );
            pw2.println("Total Full Working Days: "+newEmployee.getFullWorkingDays());
            pw2.println("Total Part Time Working Days: "+newEmployee.getPartTimeWorkingDays());
            pw2.println("Total Absent Days: "+newEmployee.getAbsentDays());
            pw2.println("Total Hours Worked: "+newEmployee.getTotalWorkingHours());
            pw2.println("------------------------------------------------------");
            input=br.readLine();
        }
        pw2.flush();
        br.close();
        pw2.close();
    }
}