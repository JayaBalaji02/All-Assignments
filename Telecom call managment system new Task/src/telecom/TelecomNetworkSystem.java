package telecom;

import java.util.*;

public class TelecomNetworkSystem {
    public static void main(String[] args) {

        Subscriber john = new Subscriber("001", "Jaya");
        Subscriber jane = new Subscriber("002", "Abu");


        john.subscribeToPlan(SubscriptionFactory.createSubscription("Premium"));
        jane.subscribeToPlan(SubscriptionFactory.createSubscription("Basic"));


        Thread johnUsage = new Thread(new UsageTracker(john, 120, 1.5, 50));
        Thread janeUsage = new Thread(new UsageTracker(jane, 90, 2.0, 30));

        johnUsage.start();
        janeUsage.start();


        BillingEngine billingEngine = BillingEngine.getInstance();
        billingEngine.generateBill(john);
        billingEngine.generateBill(jane);
    }
}
