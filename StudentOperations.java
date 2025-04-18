import java.util.*;

public class StudentOperations {
    private List<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Exit");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        displayStudents();
                        break;
                    case 3:
                        searchStudent();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        throw new InvalidChoiceException("Invalid menu option!");
                }
            } catch (InvalidChoiceException | InvalidStudentDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void addStudent() throws InvalidStudentDataException {
        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        // Validations
        if (name.isEmpty() || prn.isEmpty()) {
            throw new InvalidStudentDataException("Name or PRN cannot be empty");
        }
        if (age <= 0 || age > 100) {
            throw new InvalidStudentDataException("Invalid Age");
        }

        students.add(new Student(name, prn, age));
        System.out.println("Student added successfully!");
    }

    public void displayStudents() throws InvalidStudentDataException {
        if (students.isEmpty()) {
            throw new InvalidStudentDataException("No student data available.");
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent() throws InvalidStudentDataException {
        sc.nextLine(); // clear buffer
        System.out.print("Enter PRN to search: ");
        String prn = sc.nextLine();
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                System.out.println("Student Found: " + s);
                return;
            }
        }
        throw new InvalidStudentDataException("Student with PRN " + prn + " not found.");
    }
}
