import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class SuperCalculatorTest extends TestCase {
	private SuperCalculator calculator;
	
	@Before
	public void setUp(){
		calculator = new SuperCalculator();
	}
	
	public void testCalculateSuper(){
		int result = calculator.calculate(5004,0.09);
		assertEquals(450, result);
	}
}
