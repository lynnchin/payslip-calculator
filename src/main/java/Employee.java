/**
 * Created by lynnchin on 7/02/2016.
 */
public class Employee {
	
	private String firstName;
	private String lastName;
	private long annualSalary;
	private double superRate;
	private String paymentStartDate;
	
	public Employee(){
		
	}
	
	public Employee(String firstName, String lastName, long annualSalary, double superRate, String paymentStartDate){
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
		this.superRate = superRate;
		this.paymentStartDate = paymentStartDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(long annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getSuperRate() {
		return superRate;
	}

	public void setSuperRate(double superRate) {
		this.superRate = superRate;
	}

	public String getPaymentStartDate() {
		return paymentStartDate;
	}

	public void setPaymentStartDate(String paymentStartDate) {
		this.paymentStartDate = paymentStartDate;
	}
	
	public boolean validate(){
		boolean isValid = false;
		
		if(annualSalary < 0){
			isValid = false;
		}else if(superRate < 0.0 || superRate > 50.0){
			isValid = false;
		}
		
		return isValid;
	}
}
