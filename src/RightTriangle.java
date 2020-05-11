public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int x = a * a;
        int y = b * b;
        int z = c * c;
        boolean rightTriangle;
        rightTriangle = (
                        ((x + y) == z)
                        || ((x + z) == y)
                        || ((y + z) == x)
                        ) && a > 0 && b > 0 && c > 0;
        System.out.print(rightTriangle);

    }
}
