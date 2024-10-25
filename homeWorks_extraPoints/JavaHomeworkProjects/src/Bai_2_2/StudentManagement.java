package Bai_2_2;

import java.util.ArrayList;

public class StudentManagement {
    public ArrayList<Student> studentList = new ArrayList<>();

    public StudentManagement() {

    }

    public void showAllStudents() {
        for (Student student : studentList) {
            System.out.println(student.getInfo());
        }
    }

    public void addStudent(Student stu) {
        studentList.add(stu);
    }

    public void updateStudent(Student stu) {
        // Take data from stu
        String searchingId = stu.getId();
        String newName = stu.getName();
        int newAge = stu.getAge();

        boolean found = false;

        // Find ID and change information
        for (Student student : studentList) {
            if (searchingId.equalsIgnoreCase(student.getId())) { // If id was found in list
                student.setAge(newAge);
                student.setName(newName);

                found = true;
                System.out.printf("Student %s update information successfully!\n", searchingId);

                break; // Exit loop because ID is unique -> just find 1 ID
            }
        }

        // If not found ID in list
        if (!found) {
            System.out.println("Student with ID " + searchingId + " not found!");
        }
    }

    public void removeStudentById (String id) {
        boolean removed = studentList.removeIf((student) -> id.equalsIgnoreCase(student.getId()));

        if (removed) {
            System.out.printf("Student with ID %s was removed successfully!\n", id);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public Student searchStudentById(String id) throws StudentNotFoundException {
        for (Student student : studentList) {
            if (id.equalsIgnoreCase(student.getId())) {
                return student;
            }
        }

        // Throw exception if no student found with given ID
        throw new StudentNotFoundException("Student with ID " + id + " not found.");
    }

    public static class StudentNotFoundException extends Exception {
        public StudentNotFoundException(String message) {
            super(message); // Pass custom message to Exception class
        }
    }
}
