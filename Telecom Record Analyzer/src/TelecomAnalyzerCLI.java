import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TelecomAnalyzerCLI {

    private static final Scanner scanner = new Scanner(System.in);
    private static final CallRecordService callRecordService = new CallRecordService();

    public static void main(String[] args) {

        seedData();

        while (true) {
            System.out.println(" Telecom Call Records Analyzer");
            System.out.println("1. Show All Records");
            System.out.println("2. Longest Calls");
            System.out.println("3. Frequent Callers");
            System.out.println("4. Filter by Operator");
            System.out.println("5. Group by Location");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1": showAllRecords(); break;
                case "2": showLongestCalls(); break;
                case "3": showFrequentCallers(); break;
                case "4": filterByOperator(); break;
                case "5": groupByLocation(); break;
                case "6": System.exit(0); break;
                default: System.out.println("Invalid input.");
            }
        }
    }

    private static void seedData() {
        callRecordService.addCallRecord(new CallRecord("Alice", "9876543210", "Airtel", "Delhi",
                LocalDateTime.now().minusMinutes(10), LocalDateTime.now().minusMinutes(5)));
        callRecordService.addCallRecord(new CallRecord("Bob", "8765432109", "Jio", "Mumbai",
                LocalDateTime.now().minusHours(1), LocalDateTime.now().minusMinutes(50)));
        callRecordService.addCallRecord(new CallRecord("Alice", "9876543210", "Airtel", "Delhi",
                LocalDateTime.now().minusMinutes(30), LocalDateTime.now().minusMinutes(20)));
        callRecordService.addCallRecord(new CallRecord("Charlie", "7654321098", "VI", "Bangalore",
                LocalDateTime.now().minusHours(2), LocalDateTime.now().minusHours(1).minusMinutes(30)));
        callRecordService.addCallRecord(new CallRecord("Dave", "6543210987", "Jio", "Mumbai",
                LocalDateTime.now().minusMinutes(90), LocalDateTime.now().minusMinutes(45)));
    }

    private static void showAllRecords() {
        callRecordService.getAllRecords().forEach(System.out::println);
    }

    private static void showLongestCalls() {
        System.out.println("Longest Calls ");
        callRecordService.getLongestCalls(3).forEach(System.out::println);
    }

    private static void showFrequentCallers() {
        System.out.println("Frequent Callers ");
        Map<String, Long> frequentCallers = callRecordService.getFrequentCallers();
        frequentCallers.forEach((phone, count) ->
                System.out.println("Phone: " + phone + " | Calls: " + count));
    }

    private static void filterByOperator() {
        System.out.print("Enter operator name: ");
        String operator = scanner.nextLine().trim();
        callRecordService.filterByOperator(operator).forEach(System.out::println);
    }

    private static void groupByLocation() {
        System.out.println(" Grouped by Location ");
        Map<String, List<CallRecord>> groupedByLocation = callRecordService.groupByLocation();
        groupedByLocation.forEach((location, records) -> {
            System.out.println("Location: " + location);
            records.forEach(System.out::println);
        });
    }
}
