package ProducerConsumer;

public class ProducerConsumerLearning {
    public static void main(String[] args) {
        SharedResource sharedBuffer = new SharedResource(3);    // sharedBuffer object

        // creating producer thread using lambda expression
        Thread producerThread = new Thread(() -> {
           try {
               for(int i=1; i<=6; i++) {
                   sharedBuffer.produce(i);
               }
           } catch(Exception e) {
               // handling exception here
           }
        });

        // creating consumer thread using lambda expression
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i=1; i<=6; i++) {
                    sharedBuffer.consume();
                }
            } catch(Exception e) {
                // handling exception here
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
