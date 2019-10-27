import java.util.*;

public class DrmMessages {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        int n = list.size();
        ArrayList<Character> list2 = new ArrayList<>();
        for (int i = 0; i < n/2; i++) {
            list2.add(list.get(i));
            list.remove(i);
        }


    }
}
