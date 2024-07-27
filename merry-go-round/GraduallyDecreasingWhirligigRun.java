public class GraduallyDecreasingWhirligigRun extends WhirligigRun {
    
    @Override
    public int next() {
        int currentValue;
        if (isFinished())
            return -1;
        else {
            currentValue = array[indexPosition];
            array[indexPosition] -= decrement;
            do {
                indexPosition++;
                if (indexPosition == array.length) {
                    indexPosition = 0;
                    decrement++;
                }
            } while ((array[indexPosition] <= 0) && !isFinished());
        }
        return currentValue;
    }
    
}