/**
 * Created by lynnchin on 7/02/2016.
 */
public class TaxItem {
	private long maxLimit;
	private long minLimit;
	private double taxRate;
	private double additionCost;
	
	
	public TaxItem(){
		this(0,0,0,0);
	}
	public TaxItem(long minlimit, long maxLimit, double taxRate, double additionCost){
		this.maxLimit = maxLimit;
		this.minLimit = minlimit;
		this.taxRate = taxRate;
		this.additionCost = additionCost;
	}

	
	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public long getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(long maxLimit) {
		this.maxLimit = maxLimit;
	}

	public long getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(long minLimit) {
		this.minLimit = minLimit;
	}

	public double getAdditionCost() {
		return additionCost;
	}

	public void setAdditionCost(double additionCost) {
		this.additionCost = additionCost;
	}
}
