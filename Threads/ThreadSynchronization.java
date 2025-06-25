//Concurrency- When many threads work together on the same process(multithreading), looks simultaneous but is not
//Some Concurrency/Multithreading Hazards- Deadlocks, Starvation, Livelock, Race Conditions
//Deadlock solution- Synchronization

class First {
    public synchronized void display(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class Second extends Thread {
    String msg;
    First fobj;

    Second(First fp, String str, int priority) {
        fobj = fp;
        msg = str;
        setPriority(priority);
        start();
    }

    public void run() {
        fobj.display(msg);
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        First fnew = new First();  
        // Second s1 = new Second(fnew, "welcome");
        // Second s2 = new Second(fnew, "new");
        // Second s3= new Second(fnew, "programmer");

        //Setting priorities
        new Second(fnew, "welcome", Thread.MIN_PRIORITY);   
        new Second(fnew, "new", Thread.NORM_PRIORITY);    
        new Second(fnew, "programmer", Thread.MAX_PRIORITY); 
    }
}
