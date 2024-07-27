public class GraduallyDecreasingWhirligig extends Whirligig {

    public GraduallyDecreasingWhirligig(final int capacity) {
        super(capacity);
    }

    @Override
    public WhirligigRun run() {
        if (!isRunning) {
            isRunning = true;
            return new GraduallyDecreasingWhirligigRun();
        }
        return null;
    }
}