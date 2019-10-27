public class FreeFood {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int days = 0;

        //Doesnt check overlap
        for (int i = 0; i < n; i++) {
            int sday = io.getInt();
            int eday = io.getInt()+1;
            days += eday-sday;
        }
        System.out.println(days);
    }
}
