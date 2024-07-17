//creating a thread using realization of Runnable interface
class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    //a point to enter a thread
    public void run() {
        System.out.println(thrdName + " - a start");

        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrdName + " , counter: " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrdName + " - interrupted");
        }
        System.out.println(thrdName + " - ending");
    }
}
public class UseThreads {
    public static void main(String args[]) {
        System.out.println("Lounching the main thread");

        //first to create an object of MyThread type
        MyThread mt = new MyThread("A produced thread #1");

        //then to form a thread on the base of that object
        Thread newThrd = new Thread(mt);

        //and finally beging the thread working
        newThrd.start(); //lounching a thread to work

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Interrupting the main thread");
            }
        }

        System.out.println("Closing the main thread");
    }
}