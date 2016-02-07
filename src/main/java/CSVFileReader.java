import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class CSVFileReader {
	
	public ArrayList<Employee> readFrom(String fileName) throws PaySlipCalculatorException{
    BufferedReader br=null;
		String line="";
		ArrayList<Employee> employees = new ArrayList<>();
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				String[] employeeDetails = line.split(",");
				//FIXME: Code refactoring (later)
				Employee employee = new Employee();
				employee.setFirstName(employeeDetails[0]);
				employee.setLastName(employeeDetails[1]);
				employee.setAnnualSalary(Long.parseLong(employeeDetails[2]));
				employee.setPaymentStartDate(employeeDetails[4]);
				employee.setSuperRate(fromPercentageStringToDouble(employeeDetails[3]));
				employees.add(employee);
			}
			
		}catch(FileNotFoundException ex) {
			throw new PaySlipCalculatorException("File '" + fileName + "' not found");
		}catch(Exception ex){
			throw new PaySlipCalculatorException("Unable to read from file");
		}finally{
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return employees;
	}
	
	public double fromPercentageStringToDouble(String value) throws PaySlipCalculatorException{
		if(!value.endsWith("%")) {
			throw new PaySlipCalculatorException("value must ends with %");
		}

		return Double.parseDouble(value.substring(0, value.length() - 1)) / 100;
	}
	
}
