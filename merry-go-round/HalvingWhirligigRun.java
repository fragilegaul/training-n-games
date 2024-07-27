public class HalvingWhirligigRun extends WhirligigRun {

    @Override
    public int next() {
        int currentValue;
        if (isFinished())
            return -1;
        else {
            currentValue = array[indexPosition];
            array[indexPosition] /= 2;
            do {
                indexPosition++;
                if (indexPosition == array.length) {
                    indexPosition = 0;
                }
            } while ((array[indexPosition] <= 0) && !isFinished());
        }
        return currentValue;
    }
}