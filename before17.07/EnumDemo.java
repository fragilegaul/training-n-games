enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class EnumDemo {
    public static void main(String args[]) {
        Transport tp; //declaring a link of Transport
        tp = Transport.AIRPLANE; //initialising tp variable as AIRPLANE

        //to show a constant of enum
        System.out.println("The value of tp is: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        //compare the two constants 
        if(tp == Transport.TRAIN) //comparing the two objects if they are equal
        System.out.println("tp has TRAIN\n");

        //using enum to manage switch instruction
        switch(tp) {
            case CAR:
                System.out.println("A car transferes people");
                break;
            case TRUCK:
                System.out.println("A truck transferes load");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies");
                break;
            case TRAIN:
                System.out.println("A train runs on rails");
                break;
            case BOAT:
                System.out.println("A boat floats on the river");
                break;
        }
    }
}
