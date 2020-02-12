public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(3));
        System.out.println(area(3, 4));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }

        return width * height;
    }
}
