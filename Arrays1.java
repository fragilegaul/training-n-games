import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays1 {
    public static void main(String[] args) {
        String[][] twoAr = {{"Hello", "world!", "I"}, {"am", "a", "programmer"}};
        List<String> list = new ArrayList<>(); 
        for (int i = 0; i < twoAr.length; i++) {
            for (int j = 0; j < twoAr[i].length; j++) {  
                list.add(twoAr[i][j]); 
            }
        }
        String[] oneAr = new String[list.size()];
        for (int i = 0; i < oneAr.length; i++) {
            oneAr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(oneAr));
    }

}
