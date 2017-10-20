package exercise1;

public class WorkHourSalaryEmployee extends Employee {

	private int hourlyRoute;
	private int workHours=0;

	public WorkHourSalaryEmployee(String name, int hourlyRoute) {
		super(name);
		this.hourlyRoute = hourlyRoute;
	}

	public int computeSalary(){return (this.hourlyRoute*workHours);}

	public void sell(){}

	public void workOneHour(){workHours++;}
}
