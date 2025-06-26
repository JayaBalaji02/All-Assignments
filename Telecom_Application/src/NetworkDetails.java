import java.util.Scanner;

public class NetworkDetails {

    public void airtelNetwork(String details) throws InterruptedException {
        System.out.println("Welcome to Airtel service");

        if(details.equals("Payment Details")){
            System.out.println("Please enter your mobile number");
            Scanner sc=new Scanner(System.in);
            long mobilenum=sc.nextLong();

            String verify=String.valueOf(mobilenum);
            if(verify.length()==10){


                System.out.println("wait we will send the otp be shortly");
                Thread.sleep(3000);
                System.out.println("In Your register mobile number we sent a OTP please give 4 digit number");

                int otp=sc.nextInt();
                if(otp==1234){
                    System.out.println("Successfully verified");
                }else{
                    System.out.println("otp is wrong");
                }
                System.out.println("Hi JayaBalaji , recharge plan amount monthly RS.200 means type 200 or" +
                        "plan is 3 months Rs.500 means type 500 or other payment enter the amount like example Rs.1500 or something");
                int amount=sc.nextInt();
                if(amount==200){
                    Thread.sleep(4000);
                    System.out.println("Amount is credited an your monthly recharge is done enjoy..");

                } else if (amount==500) {
                    Thread.sleep(4000);
                    System.out.println("Amount is credited and your monthly recharge is done enjoy..");
                }
                else {
                    System.out.println("Amount is credited and your recharge is done enjoy..");
                }
            }
        }
    }
}
