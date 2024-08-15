public class WhirligigRun {
    protected int indexPosition = 0;
    protected int[] array = Whirligig.container.clone();
    protected int decrement = 1;

    public int next() {
            int count = 0;
            while (count < array.length && array[indexPosition %= array.length] <= 0) {
                indexPosition++;
                count++;
            }
            if (count == array.length) return -1;
            return array[indexPosition++]--;
         }
         
    public boolean isFinished() {
        for (int element : array) {
            if (element > 0) {
                return false;
            }
        }
        return true;
    }
}