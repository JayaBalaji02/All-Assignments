public class TelecomSystemDemo {
    public static void main(String[] args) {
        TelecomCustomerManagementSystem system = new TelecomCustomerManagementSystem();

        system.addCustomer("C001", "Alice");
        system.addCustomer("C002", "Bob");

        system.recordCall("C001", "9876543210", 120);
        system.recordCall("C001", "9123456789", 60);
        system.recordCall("C002", "9988776655", 200);

        system.subscribeVAS("C001", "Caller Tune");
        system.subscribeVAS("C001", "Missed Call Alert");
        system.subscribeVAS("C002", "Caller Tune");

        system.unsubscribeVAS("C001", "Caller Tune");

        system.fileComplaint("C001", "Network dropped frequently");
        system.fileComplaint("C002", "Unable to connect to customer care");

        system.viewComplaints("C001");

        system.displayAllCustomersSummary();
    }
}
