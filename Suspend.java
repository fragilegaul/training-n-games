class MyThread implements Runnable {
    Thread thrd;
    boolean suspended; //holds the thread if true
    boolean stopped; //stops  the thread if true

    MyThread(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
    }
    //creating and running a thread with a basic method
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);
        myThrd.thrd.start(); //runs the thread
        return myThrd;
    }
    //an entering point for the thread
    public void run() {
        System.out.println(thrd.getName() + " - lounching");
        try {
            for(int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if((i%10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                //usage of a synchronized block to check the status of values suspended and stopped
                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " - interrupted");
        }
        System.out.println(thrd.getName() + " - exit");
    }
    //stop the thread
    synchronized void mystop() {
        stopped = true;
        //the following instructions stop the holded thread completly
        suspended = false;
        notify();
    }
    //to hold on the thread
    synchronized void mysuspend() {
        suspended = true;
    }
    //to continue the thread
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
public class Suspend {
    public static void main(String args[]) {
        MyThread mt1 = MyThread.createAndStart("My thread");
        try {
            Thread.sleep(1000); //let the thread ob1 to start running

            mt1.mysuspend();
            System.out.println("Holding on the thread");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Continuing the thread");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Holding on the thread");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Going on the thread");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Stop the thread");
            mt1.mystop();
        } catch(InterruptedException exc) {
            System.out.println("Interrupting the main thread");
        }
        System.out.println("Exiting the main thread");
    }
}