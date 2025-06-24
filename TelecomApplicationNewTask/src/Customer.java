import java.util.*;

class Customer {
    private String customerId;
    private String name;
    private List<Call> callHistory;
    private Set<String> subscribedVAS;
    private List<Complaint> complaints;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.callHistory = new ArrayList<>();
        this.subscribedVAS = new HashSet<>();
        this.complaints = new ArrayList<>();
    }


    public void addCall(String number, int duration) {
        callHistory.add(new Call(number, duration));
    }


    public boolean subscribeVAS(String vasName) {
        return subscribedVAS.add(vasName);
    }


    public boolean unsubscribeVAS(String vasName) {
        return subscribedVAS.remove(vasName);
    }


    public void fileComplaint(String complaintText) {
        complaints.add(new Complaint(complaintText));
    }


    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<Call> getCallHistory() {
        return Collections.unmodifiableList(callHistory);
    }

    public Set<String> getSubscribedVAS() {
        return Collections.unmodifiableSet(subscribedVAS);
    }

    public List<Complaint> getComplaints() {
        return Collections.unmodifiableList(complaints);
    }


    public void displaySummary() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);

        System.out.println("Subscribed VAS:");
        if (subscribedVAS.isEmpty()) System.out.println("  None");
        else subscribedVAS.forEach(vas -> System.out.println("  - " + vas));

        System.out.println("Call History:");
        if (callHistory.isEmpty()) System.out.println("  No calls made.");
        else callHistory.forEach(call -> System.out.println("  " + call));

        System.out.println("Complaints:");
        if (complaints.isEmpty()) System.out.println("  No complaints filed.");
        else complaints.forEach(comp -> System.out.println("  " + comp));

        System.out.println("--------------------------------------------------");
    }
}