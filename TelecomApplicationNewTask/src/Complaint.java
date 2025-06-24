import java.util.Date;

class Complaint {
    private String complaintDetails;
    private Date complaintDate;

    public Complaint(String complaintDetails) {
        this.complaintDetails = complaintDetails;
        this.complaintDate = new Date(); // current date/time
    }

    public String toString() {
        return complaintDate + ": " + complaintDetails;
    }
}