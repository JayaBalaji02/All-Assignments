import java.util.Scanner;

public class TelecomExecution {

      public void handleExecption() {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter which service you want ");
          System.out.println("press 1 for network issue");
          System.out.println("press 2 for tower issue");
          System.out.println("press 3 for other issues");

          int a = sc.nextInt();
          switch (a) {
              case 1: {
                  System.out.println("please enter your mobile number ");
                  long mobilenum = sc.nextLong();
                  String check1 = String.valueOf(mobilenum);
                  try {
                      if (check1.length() == 10) {
                          System.out.println("Mobile number is verified and your OTP is 1122");
                          System.out.println("Your network issue will be resolved in 1 day.");
                      } else {
                          System.out.println(("You entered a wrong mobile number."));
                      }
                  } catch (ArithmeticException e) {
                      System.out.println(e.getMessage());
                  }
                  break;
              }
              case 2: {
                  System.out.println("please enter your area name we will resolve this issue");
                  String area = sc.next();
                  try {
                      if (area.equals("mumbai")) {
                          System.out.println("We will resolve it today.");
                      } else {
                          System.out.println("The area you entered is in a different sector. Please contact this number: 112233445656");
                      }
                  } catch (NullPointerException e) {
                      System.out.println(e.getMessage());
                  }
                  break;
              }
              case 3: {
                  System.out.println("for other issue please enter the details");
                  String details = sc.nextLine();
                  if (!details.isEmpty()) {
                      System.out.println("we will check this and contact you");
                  }
                  break;
              }
          }
      }
}