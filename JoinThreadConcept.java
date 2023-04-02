public class JoinThreadConcept {

    public static void main(String[] args) {
        
        // Create a new thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running...");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 has completed.");
            }
        });
        
        // Start the thread
        t1.start();

        // Wait for the thread to complete using join
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print a message indicating that the thread has completed
        System.out.println("Thread execution has completed.");
    }
}