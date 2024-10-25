package Bai_2_2;

public class Program {
    public static void main(String[] args) {
        StudentManagement students = new StudentManagement();

        System.out.println("StudentManagement after init:");
        students.showAllStudents();

        System.out.println("------------------------------------");

        // Add students to the list
        students.addStudent(new Student("S001", "Alice", 20));
        students.addStudent(new Student("S002", "Bob", 21));
        students.addStudent(new Student("S003", "Charlie", 22));

        // Show all students
        System.out.println("StudentManagement after add 3 students:");
        students.showAllStudents();

        System.out.println("------------------------------------");

        // Search for a student by ID
        System.out.println("Searching ID 003:");
        String id = "S003";

        try {
            Student student = students.searchStudentById(id);

            // Print student info if found
            System.out.println(student.getInfo());

        } catch (Exception e) {
            // Handle case where student is not found
            System.out.print(e.getMessage());
        }

        System.out.println("------------------------------------");

        // Update a student with ID S002 (e.g., changing Bob to Long)
        System.out.println("Update a student with ID S002:");

        try {
            Student student = students.searchStudentById("S002");
            student.setName("X");
            student.setAge(100);

            students.updateStudent(student);

            students.showAllStudents(); // Show updated list
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------------");

        System.out.println("Remove S002:");
        students.removeStudentById("S002");
        students.showAllStudents();
    }
}
