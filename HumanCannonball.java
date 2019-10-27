public class HumanCannonball {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        double g = 9.81;

        for (int i = 0; i < n; i++) {
            double v = io.getDouble();
            double t = io.getDouble();
            double x = io.getDouble();
            double h1 = io.getDouble();
            double h2 = io.getDouble();

            double xt =  v * Math.cos(Math.toRadians(t));
            double yt = v * Math.sin(Math.toRadians(t)) - (g*t*t)/2;

            System.out.println(xt);
            System.out.println(yt);
        }
    }
}
