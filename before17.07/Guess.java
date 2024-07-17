public class Guess {
    public static void main(String args [])
    throws java.io.IOException {

        char ch, ignore, answer = 'K';

        do {
            System.out.println("Guess a latter from A-Z");
            System.out.print("Try to guess it: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
             } while(ignore != '\n');
             
            if(ch == answer)
            System.out.println("**Correct!**");
            else {
            System.out.print("Sorry, the letter is ");
            if(ch > answer)
            System.out.println("closer to the end of the ABC");
            else
            System.out.println("closer to the beggining of the ABC");
            System.out.println("Try again!\n");
            }
        } while(answer != ch);
    }
}