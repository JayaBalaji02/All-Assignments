import java.util.*;
import java.util.stream.Collectors;

public class CallRecordService {

    private List<CallRecord> records;

    public CallRecordService() {
        this.records = new ArrayList<>();
    }

    public void addCallRecord(CallRecord record) {
        records.add(record);
    }

    public List<CallRecord> getAllRecords() {
        return records;
    }

    public List<CallRecord> getLongestCalls(int topN) {
        return records.stream()
                .sorted(Comparator.comparingLong(CallRecord::getDurationInSeconds).reversed())
                .limit(topN)
                .collect(Collectors.toList());
    }

    public Map<String, Long> getFrequentCallers() {
        return records.stream()
                .collect(Collectors.groupingBy(CallRecord::getPhoneNumber, Collectors.counting()));
    }

    public List<CallRecord> filterByOperator(String operator) {
        return records.stream()
                .filter(record -> record.getOperator().equalsIgnoreCase(operator))
                .collect(Collectors.toList());
    }

    public Map<String, List<CallRecord>> groupByLocation() {
        return records.stream()
                .collect(Collectors.groupingBy(CallRecord::getLocation));
    }
}
