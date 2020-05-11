public class GreatCircle {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        double c = Double.parseDouble(args[1]);
        double d = Double.parseDouble(args[3]);
        double x1 = Math.toRadians(a);
        double x2 = Math.toRadians(b);
        double y1 = Math.toRadians(c);
        double y2 = Math.toRadians(d);
        double sinx = Math.sin((x2-x1)/2);
        double cosx1 = Math.cos(x1);
        double cosx2 = Math.cos(x2);
        double siny = Math.sin((y2-y1)/2);
        double r = 6371.0;
        double asin = Math.asin(Math.sqrt((sinx * sinx) + (cosx1 * cosx2 * siny * siny)));
        double distance = (2 * r * asin);
        System.out.println(distance + " kilometers");
    }
}
