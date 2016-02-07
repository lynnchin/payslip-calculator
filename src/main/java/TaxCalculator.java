import java.util.ArrayList;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class TaxCalculator {
	private ArrayList<TaxItem> taxItems;

	public TaxCalculator(ArrayList<TaxItem> taxItems) {
		this.taxItems = taxItems;
	}

	public long calculate(long annualSalary)
	throws Exception {
		if (annualSalary < 0) {
			throw new Exception("Annual Salary must be greater than zero");
		}
		for (TaxItem item : taxItems) {
			if (annualSalary > item.getMinLimit() && annualSalary <= item.getMaxLimit()) {
				return Math.round((item.getAdditionCost() + (annualSalary - item.getMinLimit()) * item.getTaxRate()) / 12);
			}
		}
		return annualSalary;
	}
}
