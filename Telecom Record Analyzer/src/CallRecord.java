import java.time.Duration;
import java.time.LocalDateTime;

public class CallRecord {

    private String customerName;
    private String phoneNumber;
    private String operator;
    private String location;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public CallRecord(String customerName, String phoneNumber, String operator, String location,
                      LocalDateTime startTime, LocalDateTime endTime) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.operator = operator;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOperator() {
        return operator;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public long getDurationInSeconds() {
        return Duration.between(startTime, endTime).getSeconds();
    }

    @Override
    public String toString() {
        return customerName + " | " + phoneNumber + " | " + operator + " | " + location + " | " +
                startTime + " - " + endTime + " | Duration: " + getDurationInSeconds() + "s";
    }
}

