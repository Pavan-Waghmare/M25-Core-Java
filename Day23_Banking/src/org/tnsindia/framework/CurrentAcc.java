package org.tnsindia.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super();
		this.creditLimit = creditLimit;
		
		
	}
	public void bookProduct(float Credit)
	{
		System.out.println("Account NO:"+this.getAccNm()+","+"Account Name:"+this.getAccNm()
		+","+"Credit is: "+(Credit+creditLimit));
	}
	protected abstract String getAccNm();
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + creditLimit + "]";
	}
	

}