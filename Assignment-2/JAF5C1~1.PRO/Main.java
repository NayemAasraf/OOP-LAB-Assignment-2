public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        s1.setStudent_id("S-1001");
        s1.setStudent_name("Alex Johnson");

        // Add valid grades
        s1.addGrade(95.5);
        s1.addGrade(88.0);
        
        // Attempt to add invalid grades
        s1.addGrade(102.0);
        s1.addGrade(-5.0);

        s1.addGrade(79.5);

        // Print student details
        System.out.println("ID: " + s1.getStudent_id());
        System.out.println("Name: " + s1.getStudent_name());
        
        // Print all added (valid) grades
        System.out.println("Grades: " + s1.getGrades());
    }
}