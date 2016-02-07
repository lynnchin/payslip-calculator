/**
 * Created by lynnchin on 7/02/2016.
 */
public class PaySlipCalculatorException extends RuntimeException{
	private String message;
	
	public PaySlipCalculatorException(String message){
		super(message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
