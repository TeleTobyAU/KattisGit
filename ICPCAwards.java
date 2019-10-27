import java.util.*;

public class ICPCAwards {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            String input = io.getWord();
            map.put(input.substring(0,4), io.getWord());
        }
        for (String k : map.keySet()) {
            System.out.println(map.get(k));
        }
    }
}
