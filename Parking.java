import java.util.*;

public class Parking {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int s = io.getInt();
            ArrayList<Integer> out = new ArrayList<>();
            for (int j = 0; j < s; j++) {
                out.add(io.getInt());
            }
            Collections.sort(out);

            System.out.println(out.toString());

            int h = 0, t = 0, k = 0;
            for (int j = 0; j < s; j++) {
                t = out.get(i);
                h += t-k;
                k=t;
            }
            System.out.println(h);
        }
    }
}
//input 2
//4
//24 13 89 37
//output 13-0+24-13+89-13+89-37 = 152 <- should be