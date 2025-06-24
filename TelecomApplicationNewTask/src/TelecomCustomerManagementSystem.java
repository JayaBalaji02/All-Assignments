import java.util.HashMap;
import java.util.Map;

class TelecomCustomerManagementSystem {
    private Map<String, Customer> customers;  // Map customerId -> Customer

    public TelecomCustomerManagementSystem() {
        customers = new HashMap<>();
    }


    public boolean addCustomer(String customerId, String name) {
        if (customers.containsKey(customerId)) {
            System.out.println("Customer with ID " + customerId + " already exists.");
            return false;
        }
        customers.put(customerId, new Customer(customerId, name));
        System.out.println("Customer " + name + " added.");
        return true;
    }


    public void recordCall(String customerId, String calledNumber, int duration) {
        Customer c = customers.get(customerId);
        if (c != null) {
            c.addCall(calledNumber, duration);
            System.out.println("Call recorded for customer " + c.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }


    public void subscribeVAS(String customerId, String vasName) {
        Customer c = customers.get(customerId);
        if (c != null) {
            if (c.subscribeVAS(vasName)) {
                System.out.println(vasName + " subscribed for " + c.getName());
            } else {
                System.out.println(c.getName() + " is already subscribed to " + vasName);
            }
        } else {
            System.out.println("Customer not found.");
        }
    }


    public void unsubscribeVAS(String customerId, String vasName) {
        Customer c = customers.get(customerId);
        if (c != null) {
            if (c.unsubscribeVAS(vasName)) {
                System.out.println(vasName + " unsubscribed for " + c.getName());
            } else {
                System.out.println(c.getName() + " is not subscribed to " + vasName);
            }
        } else {
            System.out.println("Customer not found.");
        }
    }


    public void fileComplaint(String customerId, String complaintText) {
        Customer c = customers.get(customerId);
        if (c != null) {
            c.fileComplaint(complaintText);
            System.out.println("Complaint filed for " + c.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }


    public void viewComplaints(String customerId) {
        Customer c = customers.get(customerId);
        if (c != null) {
            System.out.println("Complaints for " + c.getName() + ":");
            if (c.getComplaints().isEmpty()) {
                System.out.println("  No complaints.");
            } else {
                c.getComplaints().forEach(comp -> System.out.println("  " + comp));
            }
        } else {
            System.out.println("Customer not found.");
        }
    }


    public void displayAllCustomersSummary() {
        if (customers.isEmpty()) {
            System.out.println("No customers to display.");
            return;
        }
        System.out.println("----- All Customers Summary -----");
        for (Customer c : customers.values()) {
            c.displaySummary();
        }
    }
}