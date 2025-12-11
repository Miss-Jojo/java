import java.util.Scanner;

class Rectangle {
    double length, breadth;
    double area, perimeter;

    void read(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}

class RectangleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        r.read(l, b);
        r.calculate();
        r.display();
    }
}
