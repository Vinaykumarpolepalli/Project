import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a student
class Student1 {
    private int id;
    private String name;
    private int age;
    private String course;
    private int attendance;

    // Constructor
    public Student1(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.attendance = 0; // Initialize attendance to 0
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void incrementAttendance() {
        this.attendance++;
    }

    // Display student details
    public void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Course: " + course + ", Attendance: " + attendance);
    }
//}

// Main class for Student Management System
//public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Mark Attendance");
            System.out.println("4. Update Attendance");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    markAttendance(scanner);
                    break;
                case 4:
                    updateAttendance(scanner);
                    break;
                case 5:
                    deleteStudent(scanner);
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Add a new student
    private static void addStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Student Course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, age, course);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n--- List of Students ---");
            for (Student student : students) {
                student.displayStudent();
            }
        }
    }

    // Mark attendance for a student
    private static void markAttendance(Scanner scanner) {
        System.out.print("Enter Student ID to mark attendance: ");
        int id = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                student.incrementAttendance();
                System.out.println("Attendance marked for " + student.getName());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Update attendance for a student
    private static void updateAttendance(Scanner scanner) {
        System.out.print("Enter Student ID to update attendance: ");
        int id = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Enter new attendance count: ");
                int attendance = scanner.nextInt();
                student.setAttendance(attendance);
                System.out.println("Attendance updated for " + student.getName());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Delete a student
    private static void deleteStudent(Scanner scanner) {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        boolean removed = students.removeIf(student -> student.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}
