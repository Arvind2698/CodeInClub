public class EmployeeWageComputation {

    public static int WagePerHour=20;
    public static int HoursPerDay=8;
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Calculation Program");
        int WagePerDay;
        int EmployeeAttendance=(int)(Math.random()*2);
        if(EmployeeAttendance == 0){
            WagePerDay=0;
            System.out.println("Employee is absent. Salary for the day: "+WagePerDay);
        }else{
            WagePerDay=WagePerHour*HoursPerDay;
            System.out.println("Employee is present. Salary for the day: "+WagePerDay);
        }
    }

}
