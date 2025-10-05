package part3.DaemonThread;

import part3.ThreadJoining.SharedResource;

public class Main {
    public static void main(String[] args) {
        part3.ThreadJoining.SharedResource resource = new SharedResource();

        System.out.println("Main thread started");

        Thread th1 = new Thread(() -> {
            System.out.println("Thread1 calling produce method");
            resource.produce();
        });

        th1.setDaemon(true);
        th1.start();

        System.out.println("Main thread is finishing its work");
    }
}

// OUTPUT -
//Main thread started
//Main thread is finishing its work
//Thread1 calling produce method
//Lock acquired

//As we can see here that Output got stopped at 'Lock acquired', this is because the main thread stopped working
// and so did the daemon thread also
// and thus, 'Lock released' was not printed (it didn't wait for 5 secs)
// Therefore, Daemon thread is alive till any one of the user thread is alive