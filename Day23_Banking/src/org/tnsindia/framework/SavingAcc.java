package org.tnsindia.framework;

public abstract class SavingAcc extends BankAcc{
	
	private static Object Salary;
	//constructor
	public SavingAcc(int accNo, String accNm, float isSalary, boolean isSaving) {
		super();
		
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account NO:"+this.getaccNo()+","+"Account Name:"+this.getaccNm()
		+","+"Salary is: "+this.getSalary());
	}
	protected abstract String getSalary();
	protected abstract String getaccNm();
	@Override
	public String toString() {
		return "SavingAcc [isSaving=" + isSaving + "]";
	}
	
	
}