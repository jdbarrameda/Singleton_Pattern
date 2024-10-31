import java.util.concurrent.atomic.AtomicInteger;

public class QueueManager {
    private static QueueManager instance;
    private AtomicInteger currentQueueNumber;

    private QueueManager() {
        currentQueueNumber = new AtomicInteger(0);
    }

    public static synchronized QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    public int getCurrentQueueNumber() {
        return currentQueueNumber.get();
    }

    public int nextQueueNumber() {
        return currentQueueNumber.incrementAndGet();
    }

    public void resetQueueNumber(int newNumber) {
        currentQueueNumber.set(newNumber);
    }
}
