import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class TaxCalculatorTest extends TestCase {
	private TaxCalculator calculator;
	private ArrayList<TaxItem> taxItems;
	
	@Before
	public void setUp(){
		TaxItem itemOne = new TaxItem(18200,37000,0.19,0);
		TaxItem itemTwo = new TaxItem(37000,80000,0.325,3572);
		TaxItem itemThree = new TaxItem(80000,180000,0.37,17547);
		TaxItem itemFour = new TaxItem(180000,Integer.MAX_VALUE,0.45,54547);
		
		taxItems = new ArrayList<>();

		taxItems.add(itemOne);
		taxItems.add(itemTwo);
		taxItems.add(itemThree);
		taxItems.add(itemFour);
		
		calculator = new TaxCalculator(taxItems);
	}
	
	public void testWithInvalidAnnualIncome(){
		try {
			calculator.calculate(-1000);
		}catch(Exception ex){
			assertEquals(ex.getMessage(),"Annual Salary must be greater than zero");
		}
	}
	
	public void testCalculateTaxableIncome() throws Exception{
		double result = calculator.calculate(60050);
		assertEquals(922,(long)result);
	}
	
}
