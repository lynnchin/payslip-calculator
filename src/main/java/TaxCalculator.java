import java.util.ArrayList;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class TaxCalculator {

	private static ArrayList<TaxItem> initializeTaxItems() {
		ArrayList<TaxItem> taxItems = new ArrayList<>();

		TaxItem itemOne = new TaxItem(18200, 37000, 0.19, 0);
		TaxItem itemTwo = new TaxItem(37000, 80000, 0.325, 3572);
		TaxItem itemThree = new TaxItem(80000, 180000, 0.37, 17547);
		TaxItem itemFour = new TaxItem(180000, Integer.MAX_VALUE, 0.45, 54547);

		taxItems = new ArrayList<>();

		taxItems.add(itemOne);
		taxItems.add(itemTwo);
		taxItems.add(itemThree);
		taxItems.add(itemFour);

		return taxItems;
	}

	public static long calculate(long annualSalary)
	throws PaySlipCalculatorException {
		if (annualSalary < 0) {
			throw new PaySlipCalculatorException("Annual Salary must be greater than zero");
		}
		for (TaxItem item : initializeTaxItems()) {
			if (annualSalary > item.getMinLimit() && annualSalary <= item.getMaxLimit()) {
				return Math.round((item.getAdditionCost() + (annualSalary - item.getMinLimit()) * item.getTaxRate()) / 12);
			}
		}
		return annualSalary;
	}
}
