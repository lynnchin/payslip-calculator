import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class PayslipCalculatorTest extends TestCase{
	private PaySlipCalculator paySlipCalculator;
	
	@Before
	public void setUp(){
		paySlipCalculator = new PaySlipCalculator();
	}
	
	public void testExecute(){
		paySlipCalculator.execute("input.txt","boo.txt");
	}
	
}
