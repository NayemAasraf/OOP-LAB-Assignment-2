public class Main {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(85000.75);

        emp1.setEmployee_id("E-1001");
        emp1.setEmployee_name("Alice Smith");

        System.out.println("--- Employee 1 ---");
        System.out.println("ID: " + emp1.getEmployee_id());
        System.out.println("Name: " + emp1.getEmployee_name());
        System.out.println("Salary: " + emp1.getEmployee_salary()); 

        Employee emp2 = new Employee(1250000);
        emp2.setEmployee_id("E-1002");
        emp2.setEmployee_name("Bob Johnson");
        
        System.out.println("\n--- Employee 2 ---");
        System.out.println("ID: " + emp2.getEmployee_id());
        System.out.println("Name: " + emp2.getEmployee_name());
        System.out.println("Salary: " + emp2.getEmployee_salary()); 
    }
}