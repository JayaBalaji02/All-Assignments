public class TelecomApp extends TelecomExecution{
    public static void main(String[] args) throws InterruptedException {
        TelecomService sms = new SMSService(1.5);
        TelecomService voice = new VoiceCallService(2.0);
        TelecomExecution telecomExecution=new TelecomExecution();

        NetworkDetails networkDetails=new NetworkDetails();
        networkDetails.airtelNetwork("payment details");


//        runService(sms, 10);
//        runService(voice, 5);
//        telecomExecution.handleExecption();
    }

    private static void runService(TelecomService service, int units) {
        service.start();
        service.billCustomer(units);
        service.stop();
        System.out.println();


    }
    public void airtelNetwork(){

    }
}
