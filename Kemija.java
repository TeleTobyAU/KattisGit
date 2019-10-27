import java.util.*;

public class Kemija {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String output = "";
        ArrayList<Character> list = new ArrayList<>();
        String input = io.getWord();

        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            output += list.get(i);
            if (list.get(i) == 'a' || list.get(i) == 'e' || list.get(i) == 'i' || list.get(i) == 'o' || list.get(i) == 'u') {
                i += 2;
            }
        }
        System.out.println(output);
    }
}

