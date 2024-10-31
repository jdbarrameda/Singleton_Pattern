public class Main {
    public static void main(String[] args) {
      
        HelpDeskStation station1 = new HelpDeskStation("Help Desk Station 1");
        HelpDeskStation station2 = new HelpDeskStation("Help Desk Station 2");
        HelpDeskStation station3 = new HelpDeskStation("Help Desk Station 3");

        station1.serveCustomer();
        station2.serveCustomer();
        station3.serveCustomer();

        // Reset the queue number from station 1
        station1.resetQueue(5);
        System.out.println("Current queue number after reset: " + QueueManager.getInstance().getCurrentQueueNumber());

        // Serve more customers after reset
        station2.serveCustomer();
        station3.serveCustomer();
    }
}
