import java.util.ArrayList;
import java.util.Iterator;

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
                System.out.println("Employee is absent. Salary for the day: "+this.WagePerDay);
                break;
            case 1:this.WagePerDay=this.WagePerHour*this.HoursPerDay;
                this.TotalWorkingHours+=this.HoursPerDay;
                this.FullWorkingDays++;
                System.out.println("Employee is present. Salary for the day: "+this.WagePerDay);
                break;
            case 2:this.WagePerDay=this.WagePerHour*this.PartTimeHours;
                this.TotalWorkingHours+=this.PartTimeHours;
                this.PartTimeWorkingDays++;
                System.out.println("Employee is present and working part-time. Salary for the day: "+this.WagePerDay);
                break;
            default:
                System.out.println("Error Occurred");
        }
    }

    public void CalculateWagePerMonth(){
        for(int day=1;day<=20;day++){
            while(this.TotalWorkingHours<100){
                System.out.println("Day: "+day);
                CalculateWagePerDay();
                this.TotalWageForMonth+=this.WagePerDay;
                break;
            }
        }
    }

    public void DisplayEmployeeSummary(){
        System.out.println("#######################################################################");
        System.out.println("Total Wage Earned at the end of 20 days/100 hours: "+this.TotalWageForMonth);
        System.out.println("Total Full Working Days: "+this.FullWorkingDays);
        System.out.println("Total Part Time Working Days: "+this.PartTimeWorkingDays);
        System.out.println("Total Absent Days: "+this.AbsentDays);
        System.out.println("Total Hours Worked: "+this.TotalWorkingHours);
        System.out.println("#######################################################################");
    }

}

public class EmployeeWageComputation {
    public static void main(String[] arg){
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();
        Employee emp4=new Employee();

        ArrayList<Employee> list=new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);


        Iterator<Employee> itr=list.iterator();

        while(itr.hasNext()){
            Employee e=itr.next();
            e.CalculateWagePerMonth();
            e.DisplayEmployeeSummary();
        }

    }
}