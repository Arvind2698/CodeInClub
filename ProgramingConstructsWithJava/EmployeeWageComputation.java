public class EmployeeWageComputation {

    public static int WagePerHour=20;
    public static int HoursPerDay=8;
    public static int PartTimeHours=4;
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Calculation Program");
        int WagePerDay=0;
        int TotalWageForMonth=0;
        int TotalWorkingHours=0;
        int FullWorkingDays=0;
        int PartTimeWorkingDays=0;
        int AbsentDays=0;

        for(int day=1;day<=20;day++){
            while(TotalWorkingHours<100){
            System.out.println("Day: "+day);
            int EmployeeAttendance=(int)(Math.random()*3);
            switch(EmployeeAttendance){
                case 0:WagePerDay=0;
                TotalWorkingHours+=0;
                AbsentDays++;
                System.out.println("Employee is absent. Salary for the day: "+WagePerDay);
                break;
                case 1:WagePerDay=WagePerHour*HoursPerDay;
                TotalWorkingHours+=HoursPerDay;
                FullWorkingDays++;
                System.out.println("Employee is present. Salary for the day: "+WagePerDay);
                break;
                case 2:WagePerDay=WagePerHour*PartTimeHours;
                TotalWorkingHours+=PartTimeHours;
                PartTimeWorkingDays++;
                System.out.println("Employee is present and working part-time. Salary for the day: "+WagePerDay);
                break;
                default:
                System.out.println("Error Occurred");
            }
            TotalWageForMonth+=WagePerDay;
            break;
        }
        }
        System.out.println("#######################################################################");
        System.out.println("Total Wage Earned at the end of 20 days/100 hours: "+TotalWageForMonth);
        System.out.println("Total Full Working Days: "+FullWorkingDays);
        System.out.println("Total Part Time Working Days: "+PartTimeWorkingDays);
        System.out.println("Total Absent Days: "+AbsentDays);
        System.out.println("Total Hours Worked: "+TotalWorkingHours);
        System.out.println("#######################################################################");

    }

}