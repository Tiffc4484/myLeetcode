import java.util.*;
public class solution13 {
    public int romanToInt(String s) {
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int toReturn = 0;
        int last = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            toReturn += roman.get(current);

            if (roman.get(current) > last) {
                toReturn -= 2 * last;
            }

            last = roman.get(current);
        }
        return toReturn;
    }
}
