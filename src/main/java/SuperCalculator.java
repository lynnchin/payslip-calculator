/**
 * Created by lynnchin on 7/02/2016.
 */
public class SuperCalculator {
	
	public SuperCalculator(){
	}
	
	public int calculate(double grossIncome, double superRate){
		return (int)Math.round(grossIncome * superRate);
	}
}
