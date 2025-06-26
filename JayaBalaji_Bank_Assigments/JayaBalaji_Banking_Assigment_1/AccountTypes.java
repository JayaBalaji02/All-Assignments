package com.day2.assiment;

public interface AccountTypes {
	
	void savings_acc(Customerdetails customer_details);
	void current_acc(Customerdetails customer_details);
	void new_acc(String name,long addharnum,long depositAmmount);

	void serviceBranch();

	void towerZone();

//	void savingAccount();
//	void currentAccount();
}
