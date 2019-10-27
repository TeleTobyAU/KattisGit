public class Volim {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int k = io.getInt(), n = io.getInt();

        int time = 0;
        int j = k-1;
        for (int i = 0; i < n; i++) {
            if (time >= 210) {
                System.out.println(j);
                return;
            }
            time += io.getInt();
            String c = io.getWord();
            if (c.equals("T")) j++;
        }
        System.out.println(j);
    }
}
