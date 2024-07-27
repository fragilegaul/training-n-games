public class Whirligig {
    int capacity;
    static int[] container;
    private int counter = 0;
    boolean isRunning = false;

    public Whirligig(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException();
        this.capacity = capacity;
        container = new int[capacity];
    }

    public boolean addElement(int element){
        if (isRunning || element <= 0 || counter >= capacity) {
            return false;
        }
        container[counter] = element;
        counter++;
        return true;
    }

    public WhirligigRun run(){
        if (!isRunning) {
            isRunning = true;
            return new WhirligigRun();
        }
        return null;
    }
}