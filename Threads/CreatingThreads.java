class MyThread extends Thread{
    private String threadName;
    public MyThread(String name){
        this.threadName= name;
        System.out.println(" Creating"+ threadName);
    }

    @Override
    public void run(){
        System.out.println("Running"+ threadName);
        try{
            for(int i=4;i>0;i--){
                System.out.println("Thread "+ threadName+ ", "+ i);
                Thread.sleep(50);//pause for 50 milliseconds
            }
        }catch(InterruptedException e){
            System.out.println("Thread "+threadName+ " interrupted.");
        }
        System.out.println("Thread "+ threadName+ " exiting.");
    }

}
public class CreatingThreads {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1");
        thread1.setPriority(Thread.MIN_PRIORITY); 
        thread1.start();//starts a thread, calls run concurrently
        
        MyThread thread2= new MyThread("Thread-2");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();//starts another thread

    }
}
