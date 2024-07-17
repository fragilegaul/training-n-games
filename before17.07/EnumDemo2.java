//usage of enum included methods 
enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class EnumDemo2 {
    public static void main(String args[]) 
    {
        Transport tp; //declaring a link of Transport
        System.out.println("The constants of Transport:");

        //usage of values() method
        Transport allTransports[] = Transport.values(); //receiving an array of Transport constants
        for(Transport t: allTransports)
        System.out.println(t);

        System.out.println();

        //usage of valueOf() method
        tp = Transport.valueOf("AIRPLANE");  //getting a constant of AIRPLANE
        System.out.println("tp contents " + tp);     
    }
}