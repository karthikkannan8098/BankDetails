package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposit(int amount) {
		System.out.println("axis bank deposit is"+amount);
		super.deposit(15000);
		super.saving(18000);
		super.fixed(25000);
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposit(20000);
				
				
	}
	
	

}
