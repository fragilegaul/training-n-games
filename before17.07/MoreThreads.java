class MyThread implements Runnable {
    Thread thrd;
    //a new thread constructor
    MyThread(String name) {
        thrd = new Thread(this, name);
    }
    //creating and lounching a thread using basic method
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);
        myThrd.thrd.start(); //beginning of thread
        return myThrd;
    }
    //an entering point for a thread
    public void run() {
        System.out.println(thrd.getName() + " - lounching.");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", counter: " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " - interrupted");
        }
        System.out.println(thrd.getName() + " - ending");
    }
}
public class MoreThreads {
    public static void main(String args []) {
        System.out.println("Louncing the main thread.");

        MyThread mt1 = MyThread.createAndStart("Produced thread #1");
        MyThread mt2 = MyThread.createAndStart("Produced thread #2");
        MyThread mt3 = MyThread.createAndStart("Produced thread #3"); //creating and lounching 3 threads

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Interrupting the main thread");
            }
        } while(mt1.thrd.isAlive() ||
                mt2.thrd.isAlive() || //waiting while all the threads will be closed
                mt3.thrd.isAlive());
        System.out.println("Finishing the main thread");
    }
}