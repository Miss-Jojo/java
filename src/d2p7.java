class RectangleArea {
    double length, breadth;

    RectangleArea() {
        length = 0;
        breadth = 0;
    }

    RectangleArea(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class AreaMain {
    public static void main(String[] args) {

        RectangleArea r1 = new RectangleArea();
        System.out.println("Area (default) = " + r1.area());

        RectangleArea r2 = new RectangleArea(10, 5);
        System.out.println("Area (parameterized) = " + r2.area());
    }
}
