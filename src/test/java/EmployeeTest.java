import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class EmployeeTest extends TestCase{
	private Employee employee;
	
	@Before
	public void setUp(){
		employee = new Employee("lynn","chin",65000,0.40,"01 March - 31 March");
	}
	
	public void testIfEmployeeInstanceIsCreated(){
		assertNotNull(employee);
	}
	
	public void testIfAnnualSalaryIsInvalid(){
		employee.setAnnualSalary(-100000);
		assertFalse(employee.validate());
	}
	
	public void testSuperRateIsInvalid(){
		employee.setSuperRate(100.0);
		assertFalse(employee.validate());
		
		employee.setAnnualSalary(-10000);
		employee.setSuperRate(43.0);
		assertFalse(employee.validate());
	}
}
