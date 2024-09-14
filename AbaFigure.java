//30
public class AbaFigure {
    public static void goingForward(Character[] arr, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void goingBack(Character[] arr, int index) {
        for (int i = index; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Character[] array = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            goingForward(array, counter);
            goingBack(array, counter);
            System.out.println();
            counter++;
        }
    }
}