abstract class EmployeeWageAbstract{
    public int WagePerHour;
    public int HoursPerDay;
    public int PartTimeHours;

    public int WagePerDay;
    public int TotalWageForMonth;
    public int TotalWorkingHours;
    public int FullWorkingDays;
    public int PartTimeWorkingDays;
    public int AbsentDays;

    public EmployeeWageAbstract(int WagePerHour,int HoursPerDay,int PartTimeHours){
        this.WagePerHour=WagePerHour;
        this.HoursPerDay=HoursPerDay;
        this.PartTimeHours=PartTimeHours;
        this.WagePerDay=0;
        this.TotalWageForMonth=0;
        this.TotalWorkingHours=0;
        this.FullWorkingDays=0;
        this.PartTimeWorkingDays=0;
        this.AbsentDays=0;
    }

    public int CalculateAttendance(){
        return (int)(Math.random()*3);
    }

    public abstract void CalculateWagePerDay();

    public abstract void CalculateWagePerMonth();

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
