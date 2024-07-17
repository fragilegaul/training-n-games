class ShBitDemo {
    int numbits;

    ShBitDemo (int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;
        mask <<= numbits-1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1) {
            if((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
class ShBit {
    public static void main(String args []) {
        ShBitDemo b = new ShBitDemo(8);
        ShBitDemo i = new ShBitDemo(32);
        ShBitDemo li = new ShBitDemo(64);

        System.out.println("123 in binery is: ");
        b.show(123);

        System.out.println("\n87987 in binery is: ");
        i.show(87987);

        System.out.println("\n237658768 in binery is: ");
        li.show(237658768);

        System.out.println("\nThe youngest 8 bits of 87987 in binery are: ");
        b.show(87987);
    }
}