public class HelpDeskStation {
    private String stationName;

    public HelpDeskStation(String name) {
        this.stationName = name;
    }

    // Serve a customer and print the current queue number
    public void serveCustomer() {
        int queueNumber = QueueManager.getInstance().nextQueueNumber();
        System.out.println(stationName + " is serving customer with queue number: " + queueNumber);
    }

    // Reset the queue number from this station
    public void resetQueue(int newNumber) {
        QueueManager.getInstance().resetQueueNumber(newNumber);
        System.out.println(stationName + " has reset the queue number to: " + newNumber);
    }
}
