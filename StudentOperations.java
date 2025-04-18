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

    
}
