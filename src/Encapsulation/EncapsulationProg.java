package Encapsulation;

public class EncapsulationProg {
	
	private double salaryofEmp;
	
	public void setSalary(double salary) //50000.12
	{
	salaryofEmp = salary; //50000.12
	}
	public void getSalary()
	{
	System.out.println("Salary of Employee = " + salaryofEmp); //0.0
	}
	
	public static void main(String[] args) {
		EncapsulationProg z = new EncapsulationProg();
		z.getSalary();
		z.setSalary(50000.12);
		z.getSalary();
		}

}
