class WallMartEmployee extends EmployeeWageAbstract{

    WallMartEmployee(int WagePerHour,int HoursPerDay,int PartTimeHours){
        super(WagePerHour,HoursPerDay,PartTimeHours);
    }

    public void CalculateWagePerDay(){
        int EmployeeAttendance=CalculateAttendance();
        switch(EmployeeAttendance){
            case 0:this.WagePerDay=0;
                this.TotalWorkingHours+=0;
                this.AbsentDays++;
                // System.out.println("Employee is absent. Salary for the day: "+this.WagePerDay);
                break;
            case 1:this.WagePerDay=this.WagePerHour*this.HoursPerDay;
                this.TotalWorkingHours+=this.HoursPerDay;
                this.FullWorkingDays++;
                // System.out.println("Employee is present. Salary for the day: "+this.WagePerDay);
                break;
            case 2:this.WagePerDay=this.WagePerHour*this.PartTimeHours;
                this.TotalWorkingHours+=this.PartTimeHours;
                this.PartTimeWorkingDays++;
                // System.out.println("Employee is present and working part-time. Salary for the day: "+this.WagePerDay);
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
}

class TargetEmployee extends EmployeeWageAbstract{

    TargetEmployee(int WagePerHour,int HoursPerDay,int PartTimeHours){
        super(WagePerHour,HoursPerDay,PartTimeHours);
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
}

class IkeaEmployee extends EmployeeWageAbstract{

    IkeaEmployee(int WagePerHour,int HoursPerDay,int PartTimeHours){
        super(WagePerHour,HoursPerDay,PartTimeHours);
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
}

public class EmployeeWageComputation {
    public static void main(String[] arg){
        WallMartEmployee mark=new WallMartEmployee(20, 8, 4);
        TargetEmployee lucas=new TargetEmployee(30, 8, 4);
        IkeaEmployee john=new IkeaEmployee(25, 8, 4);
        System.out.println("**************WallMartEmployee*****************");
        mark.CalculateWagePerMonth();
        mark.DisplayEmployeeSummary();
        System.out.println("**************TargetEmployee*****************");
        lucas.CalculateWagePerMonth();
        lucas.DisplayEmployeeSummary();
        System.out.println("**************IkeaEmployee*****************");
        john.CalculateWagePerMonth();
        john.DisplayEmployeeSummary();
    }
}