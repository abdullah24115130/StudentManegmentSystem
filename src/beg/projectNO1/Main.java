package beg.projectNO1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll");
            System.out.println("4. Delete Student by Roll");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // buffer clear

            switch (choice) {
                case 1: // Add Student
                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Id: ");
                    int id = input.nextInt();
                    input.nextLine(); // buffer clear

                    System.out.print("Enter Department: ");
                    String department = input.nextLine();

                    Student s = new Student(name, id, department);
                    studentList.add(s);
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2: // View All Students
                    System.out.println("\n------ All Students ------");
                    for (Student stu : studentList) {
                        stu.displayInfo();
                        System.out.println("-------------------------");
                    }
                    break;

                case 3: // Search Student
                    System.out.print("Enter roll to search: ");
                    int searchRoll = input.nextInt();
                    boolean found = false;

                    for (Student stu : studentList) {
                        if (stu.id == searchRoll) {
                            System.out.println("✅ Student found:");
                            stu.displayInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println(" Student not found.");
                    }
                    break;

                case 4: // Delete Student
                    System.out.print("Enter roll to delete: ");
                    int deleteRoll = input.nextInt();
                    found = false;

                    for (Student stu : studentList) {
                        if (stu.id == deleteRoll) {
                            studentList.remove(stu);
                            System.out.println("🗑️ Student deleted successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("❌ Student not found.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("👋 Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
