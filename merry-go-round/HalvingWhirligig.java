public class HalvingWhirligig extends Whirligig {

    public HalvingWhirligig(final int capacity) {
        super(capacity);
    }

    @Override
    public WhirligigRun run() {
        if (!isRunning) {
            isRunning = true;
            return new HalvingWhirligigRun();
        }
        return null;
    }
}