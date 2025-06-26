package com.day2.assiment;

public class Customerdetails {

	 long account_num;
	 String account_name;
	 String IFCcode;
	 
//	 String newAccName;
//	 
//	
//	 public String getNewAccName() {
//		return newAccName;
//	}

//	public void setNewAccName(String newAccName) {
//		this.newAccName = newAccName;
//	}

	public Customerdetails(long account_num, String account_name, String iFCcode) {
		super();
		this.account_num = account_num;
		this.account_name = account_name;
		IFCcode = iFCcode;
	}
	
	public long getAccount_num() {
		return account_num;
	}
	public void setAccount_num(long account_num) {
		this.account_num = account_num;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getIFCcode() {
		return IFCcode;
	}
	public void setIFCcode(String iFCcode) {
		IFCcode = iFCcode;
	}
	 
	 
}
