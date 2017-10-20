package exercise1;

public class FixedSalaryEmployee extends Employee {

	private int fixedSalary;

	public FixedSalaryEmployee(String name, int fixedSalary) {
		super(name);
		this.fixedSalary=fixedSalary;
	}

	public int computeSalary(){
		return this.fixedSalary;
	}

	public void sell(){}

	public void workOneHour(){}

}
