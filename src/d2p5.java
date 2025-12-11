import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int r, String n, double c) {
        roll = r;
        name = n;
        cgpa = c;
    }
}

class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Roll: ");
            int roll = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();

            s[i] = new Student(roll, name, cgpa);
        }

        System.out.println("\nDisplaying student details:");
        for (Student st : s) {
            System.out.println(st.roll + "   " + st.name + "   " + st.cgpa);
        }

        Student lowest = s[0];
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < lowest.cgpa)
                lowest = s[i];
        }

        System.out.println("\nStudent with lowest CGPA: " + lowest.name);
    }
}
