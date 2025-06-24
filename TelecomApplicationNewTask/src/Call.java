class Call {
    private String calledNumber;
    private int durationInSeconds;

    public Call(String calledNumber, int durationInSeconds) {
        this.calledNumber = calledNumber;
        this.durationInSeconds = durationInSeconds;
    }

    public String toString() {
        return "Call to: " + calledNumber + ", Duration: " + durationInSeconds + " seconds";
    }
}