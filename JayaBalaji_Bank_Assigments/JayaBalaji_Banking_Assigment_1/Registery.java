package com.day2.assiment;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Registery extends HDFCbank {
	
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to HDFC bank please select the option to continue");
	System.out.println("Press 1 for new account opening , Press 2 for savings account details , Press 3 for current account details");
	Registery res=new Registery();
	AdditinalInfo thread1=new AdditinalInfo();
	SupportDetails thread2=new SupportDetails();
	HelpDeskSupport thread3 =new HelpDeskSupport();

	int option=sc.nextInt();
	switch (option){
		case 1:{

			System.out.println("you need a individual account Type (Individual) or Business account type (Business");
			String option2=sc.next();
			if(option2.equals("Individual")){
				System.out.println("you are eligible for creating savings account and minium  balance should be deposit RS.1000");
				res.new_acc("velu",111122223333L,500);
			}else {
				System.out.println("Sorry Business purpose is not eligible for savings account");
			}

			try{
				Thread.sleep(2000);
				thread2.start();
			}catch (Exception e){
				e.printStackTrace();
			}
			break;
		}
		case 2:{
			try{

				Thread.sleep(2000);
				thread1.start();
				Thread.sleep(3000);

			Customerdetails customer1=new Customerdetails(1234,"Balaji","SBI123");
			Customerdetails customer2=new Customerdetails(4321,"abu","HDFC321");

			res.savings_acc(customer1);
			res.current_acc(customer2);

			}catch (Exception e){
				e.printStackTrace();
			}
			break;
		}
		case  3:
		{
			Thread ans=new Thread(()-> {
				try {
					thread3.support(true);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			ans.start();

			try {
				Thread.sleep(3000);
				thread3.support(true);
			}catch (InterruptedException e){
				e.printStackTrace();
			}


			thread3.offergiven();

		}
		break;
	}


//	Registery res=new Registery();

//	Customerdetails customer2=new Customerdetails(4321,"abu","HDFC321");
//	Customerdetails customer1=new Customerdetails(1234,"Balaji","SBI123");


//	res.savings_acc(customer1);
//	res.current_acc(customer2);
//	res.new_acc("velu",111122223333L,500);

//	res.towerZone();
//	res.towerZone("North zone");
//	res.towerZone("North zone","Mumbai");
//
//	res.serviceBranch();
//	res.serviceBranch("Saidapet");
//	res.serviceBranch("Tambaram",1100);



}

}
