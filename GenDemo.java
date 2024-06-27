//a simple Gen class
//here T is parameter of a type, which will be replaced 
//by really existing type during the creation of an object of Gen class
class Gen<T> {
    T ob; //to declare an object of a type T

    //to pass a link of T object to a constructor
    Gen(T o) {
        ob = o;
    }
    //to get an object 'ob' back from a method
    T getob() {
        return ob;
    }
    //to show type 'T'
    void showType() {
        System.out.println("Type T is - " + ob.getClass().getName());
    }
}
//demostration of usage of Generic class
public class GenDemo {
    public static void main(String args []) {
        //create a generic link to an integer value
        Gen<Integer> iOb;

        //create an object of Gen<Integer> type and put a link to it
        //with the help of variable 'iOb', pay attention on an autopackaging
        //during the incapsulation of a value of 88 in object of Integer type
        iOb = new Gen<Integer>(88); //creating an exemple of type Gen<Integer>

        //to show a type of data used in object 'iOb'
        iOb.showType();

        //to get the values out of iOb object; there's no need to match types
        int v = iOb.getob();
        System.out.println("The value is: " + v);
        System.out.println();

        //create an object of Gen type for strings
        Gen<String> strOb = new Gen<String>("Testing generics");//creating a link and an object

        //to show the type of data used in object strOb
        strOb.showType();

        //to get values from strOb object, no need to match types
        String str = strOb.getob();
        System.out.println("The value is: " + str);
    }
}