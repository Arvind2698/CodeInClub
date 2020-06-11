public class EmployeeWageComputation {

    public static int WagePerHour=20;
    public static int HoursPerDay=8;
    public static int PartTimeHours=4;
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Calculation Program");
        int WagePerDay;
        int EmployeeAttendance=(int)(Math.random()*3);
	switch(EmployeeAttendance){
            case 0:WagePerDay=0;
            System.out.println("Employee is absent. Salary for the day: "+WagePerDay);
            break;
            case 1:WagePerDay=WagePerHour*HoursPerDay;
            System.out.println("Employee is present. Salary for the day: "+WagePerDay);
            break;
            case 2:WagePerDay=WagePerHour*PartTimeHours;
            System.out.println("Employee is present and working part-time. Salary for the day: "+WagePerDay);
            break;
            default:
                System.out.println("Error Occurred");
        }
    }

}













