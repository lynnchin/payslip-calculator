import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.junit.Before;

import java.util.ArrayList;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class CSVFileWriterTest extends TestCase{
	private CSVFileWriter writer;
	
	@Before
	public void setUp(){
		writer = new CSVFileWriter();
	}
	
	public void testWriteDataToFile(){
		 Employee employeeOne = EasyMock.createNiceMock(Employee.class);
		 EasyMock.replay(employeeOne);
		 ArrayList<Employee> employees = new ArrayList<>();
		 employees.add(employeeOne);
		 writer.writeToFile("output.txt",employees);
	}
}
