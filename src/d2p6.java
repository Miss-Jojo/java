class Subtract {

    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

class SubtractMain {
    public static void main(String[] args) {
        Subtract s = new Subtract();

        System.out.println("subtract(10, 5) = " + s.subtract(10, 5));
        System.out.println("subtract(15.5, 4.2) = " + s.subtract(15.5, 4.2));
        System.out.println("subtract(20, 5, 3) = " + s.subtract(20, 5, 3));
    }
}
