import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class CSVFileReaderTest extends TestCase {
	CSVFileReader reader;
	
	@Before
	public void setUp(){
		reader = new CSVFileReader();
	}
	
	public void testReadInvalidFile(){
		try{
			reader.readFrom("blar.txt");
		}catch(PaySlipCalculatorException ex){
			assertEquals("File not found",ex.getMessage());
		}
	}

	public void testFromPercentageToDoubleWithInvalidValue(){
		try {
			double result = reader.fromPercentageStringToDouble("1");
		}catch(PaySlipCalculatorException ex){
			assertEquals("value must ends with %",ex.getMessage());
		}
	}
	
	public void testFromPercentageToDoubleWithValidValue(){
		try {
			double result = reader.fromPercentageStringToDouble("1%");
			assertEquals(0.01, result);
		}catch(PaySlipCalculatorException ex){
			//do nothing
		}
	}
	
	public void testReadFromValidFile(){
		try{
			ArrayList<Employee> employees = reader.readFrom("input.txt");
			assertEquals(2, employees.size());
			
			Employee employeeOne = employees.get(0);
			assertEquals("David",employeeOne.getFirstName());
			assertEquals("Rudd",employeeOne.getLastName());
			assertEquals("01 March – 31 March",employeeOne.getPaymentStartDate());
			assertEquals(60050,employeeOne.getAnnualSalary());
			assertEquals(0.09,employeeOne.getSuperRate());

			Employee employeeTwo = employees.get(1);
			assertEquals("Ryan",employeeTwo.getFirstName());
			assertEquals("Chen",employeeTwo.getLastName());
			assertEquals("01 March – 31 March",employeeTwo.getPaymentStartDate());
			assertEquals(120000,employeeTwo.getAnnualSalary());
			assertEquals(0.1,employeeTwo.getSuperRate());
			
		}catch(Exception ex){
			//do nothing
		}
	}
}
