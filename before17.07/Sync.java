class SumArray {
    private int sum;

    int sumArray(int nums[]) {
        sum = 0; 
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("Current value of sum for " + 
                                Thread.currentThread().getName() + " equals " + sum);
            try {
                Thread.sleep(10);
            }
            catch(InterruptedException exc) {
                System.out.println("The thread is interrupted");
            }
        }
        return sum;
    }
}

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    //a new thread constructor
    MyThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
    }
    //creating and running a thread
    public static MyThread createAndStart(String name, int nums[]) {
        MyThread myThrd = new MyThread(name, nums);

        myThrd.thrd.start();
        return myThrd;
    }
    //an entering point for the thread
    public void run() {
        System.out.println(thrd.getName() + " - lounching.");

        //synchronization of sumArray calls
        synchronized(sa) {
            answer = sa.sumArray(a); //here calls of method sumArray for sa object are synchronized
        }
        System.out.println("Summery for " + thrd.getName() + " will be " + answer);
        System.out.println(thrd.getName() + " - ending.");
    }
}

public class Sync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        MyThread mt1 = MyThread.createAndStart("Produced thread #1", a);
        MyThread mt2 = MyThread.createAndStart("Produced thread #2", a);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Interrupting the main thread");
        }
    }
}