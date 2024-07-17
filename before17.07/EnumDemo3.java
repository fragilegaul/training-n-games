//usage of a constructor, a variable of an example and a method of the enum
enum Transport {
    CAR(100), TRUCK(80), AIRPLANE(900), TRAIN(120), BOAT(35);//inicialization
    private int speed; //typical speed of a vehicle

    //a constructor
    Transport(int s) { speed = s; } //add a constructor

    //a method
    int getSpeed() { return speed; }
}

public class EnumDemo3 {
    public static void main(String args[]) {
        //to show the speed of an airplane
        System.out.println("A typical speed of an airplane is: " +
                            Transport.AIRPLANE.getSpeed() + " km/h\n");

        //show all the vehicles and their speed
        System.out.println("Typical speed of vehicles are:");

        for(Transport t: Transport.values())
        System.out.println(t + ": " + t.getSpeed() + " km/h");  
    }
}