public class Employee {

    private String employee_id;
    private String employee_name;
    private double employee_salary;

    public Employee(double initial_salary) {
        if (initial_salary >= 0) {
            this.employee_salary = initial_salary;
        } else {
            this.employee_salary = 0;
        }
    }

    public String getEmployee_id() {
        return this.employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return this.employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_salary() {
        return String.format("$%,.2f", this.employee_salary);
    }
}