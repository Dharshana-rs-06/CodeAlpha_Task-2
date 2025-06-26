import java.util.*;

class Student {
    String name;
    ArrayList<Integer> grades;

    Student(String name, int grade) {
        this.name = name;
        this.grades = new ArrayList<>();
        grades.add(grade);
    }

    public void operations() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        int s = grades.size();
        System.out.println("Average: " + (sum / s));
        System.out.println("Highest: " + Collections.max(grades));
        System.out.println("Lowest: " + Collections.min(grades));
    }
}

public class studentrecord {
    ArrayList<Student> records = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        studentrecord obj = new studentrecord();
        obj.runMenu();
    }

    public void runMenu() {
        int ch;
        do {
            System.out.println("\n*** Student Mark Tracker ***");
            System.out.println("1: Input student details");
            System.out.println("2: Calculate average, highest, lowest");
            System.out.println("3: Summary");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    inputValue();
                    break;
                case 2:
                    performOperations();
                    break;
                case 3:
                    summary();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Enter a valid option!");
            }
        }
        while(ch!=4);
    }

    public void inputValue() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter grade: ");
        int g = sc.nextInt();
        records.add(new Student(name, g));
        System.out.println("Details successfully entered.");
    }

    public void performOperations() {
        for (Student s : records) {
            System.out.println("\nStudent: " + s.name);
            s.operations();
        }
    }

    public void summary() {
        for (Student s : records) {
            System.out.println("\nStudent Name: " + s.name);
            System.out.println("Grades: " + s.grades);
        }
    }
}
