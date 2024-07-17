
public class Rectangle {

    private int sideA;
    private int sideB;

    Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return this.sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return this.sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    
    public int perimRec() {
        return (sideA + sideB) * 2;
    }

    public int areaRec() {
        return (sideA * sideB);
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(40, 100);
        System.out.println(rec1.perimRec());

        Rectangle rec2 = new Rectangle(5, 500);
        System.out.println(rec2.areaRec()); 

    }
    
}