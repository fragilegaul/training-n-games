package enumusage;

public enum Direction {
    N(0), NE(45), E(90), SE(135),
    S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }
    private int degrees;

    public static Direction closestToDegrees(int degrees) {
        Direction[] directions = Direction.values();
        if (degrees == 360) {
            return Direction.N;
        }
        if (degrees < 0) {
            degrees += 360;
        }
        if (degrees > 360) {
            degrees %= 360;
        }
        int left = 0, right = directions.length-1;
        while (left < right) {
            if (Math.abs(directions[left].degrees - degrees) <= Math.abs(directions[right].degrees - degrees)) {
                right--;
            } else {
                left++;
            }
        }
        return directions[left];
    }

    public Direction opposite() {
        int index = this.ordinal();
        Direction[] directions = Direction.values();
        if (index < directions.length/2) {
            return directions[index + directions.length/2];
        } else {
            return directions[index - directions.length/2];
        }
    }

    public int differenceDegreesTo(Direction direction) {
        int dys = this.degrees;
        if (dys == 0 && direction.degrees - dys > S.degrees) {
            dys = 360;
        }
        if (dys > direction.degrees) {
            return dys - direction.degrees;
        } else {
            return direction.degrees - dys;
        }
    }
}