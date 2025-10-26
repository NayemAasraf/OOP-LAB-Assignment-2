import java.util.ArrayList;
import java.util.List;

public class Student {
    
    private String student_id;
    private String student_name;
    private List<Double> grades;

    public Student() {
        this.grades = new ArrayList<>();
    }

    // Getter and Setter for student_id
    public String getStudent_id() {
        return this.student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    // Getter and Setter for student_name
    public String getStudent_name() {
        return this.student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    // Method to add a grade with validation
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        } else {
            System.out.println("Invalid grade: " + grade + ". Grade must be between 0 and 100.");
        }
    }

    // Helper method to display the list of grades
    public List<Double> getGrades() {
        return this.grades;
    }
}