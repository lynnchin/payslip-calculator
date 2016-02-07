import java.util.ArrayList;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class PaySlipCalculator {
	
	public void execute(String inputFile, String outputFile){
		 CSVFileReader reader = new CSVFileReader();
		 ArrayList<Employee> employees = reader.readFrom(inputFile);
		
		 for(Employee employee : employees){
			 employee.setIncomeTax((int)calculateIncomeTax(employee.getAnnualSalary()));
			 employee.setSuperAmount((int)calculateSuper(employee.grossIncome(),employee.getSuperRate()));
		 }
		
		CSVFileWriter writer = new CSVFileWriter();
		writer.writeToFile(outputFile,employees);
	}
	
	public static void main(String[] args){
		if(args.length < 2){
			System.out.println("Command:java -jar payslip-calculator-1.0-SNAPSHOT.jar <input file> <output file>");
		}
		PaySlipCalculator paySlipCalculator = new PaySlipCalculator();
		paySlipCalculator.execute(args[0],args[1]);
	}
	
	public long calculateIncomeTax(long annualSalary){
		return TaxCalculator.calculate(annualSalary);
	}
	
	public double calculateSuper(int grossIncome, double superRate){
		return SuperCalculator.calculate(grossIncome,superRate);
	}
}
