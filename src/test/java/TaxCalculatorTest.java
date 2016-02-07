import junit.framework.TestCase;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class TaxCalculatorTest extends TestCase {
	
	public void testWithInvalidAnnualIncome() {
		try {
			TaxCalculator.calculate(-1000);
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "Annual Salary must be greater than zero");
		}
	}

	public void testCalculateTaxableIncome()
	throws Exception {
		double result = TaxCalculator.calculate(60050);
		assertEquals(922, (long) result);
	}
}
