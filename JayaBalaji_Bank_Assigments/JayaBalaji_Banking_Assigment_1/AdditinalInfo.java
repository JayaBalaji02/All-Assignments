package com.day2.assiment;

public class AdditinalInfo extends Thread{
    public void run(){
        System.out.println("Thank you are choosing HDFC bank we will support 24/7 service");
    }
}
class SupportDetails extends Thread{
    public void run(){
       int person =5,count=1;
        for(int i=0;i<5;i++){
            long mobileNum = 1000000000L + (long) (Math.random() * 9000000000L);
            try{
            Thread.sleep(2000);
            System.out.println("person "+count+" contact number : "+mobileNum);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            count++;
        }

    }
}
 class HelpDeskSupport {
    public synchronized void support(boolean str) throws InterruptedException {

            if (str) {
                System.out.println("waiting for the offer");
                wait();
                System.out.println("Online app also available in play store and App store");
            }
        }
        public synchronized void offergiven(){
            System.out.println("Install and take cashback");
            notifyAll();
            System.out.println("upto RS.200");
        }
    }