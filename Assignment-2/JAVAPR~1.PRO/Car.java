public class Car {

    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public Car(double initialMileage) {
        if (initialMileage >= 0) {
            this.mileage = initialMileage;
        } else {
            this.mileage = 0;
        }
    }

    // Getters and Setters for company_name
    public String getCompany_name() {
        return this.company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    // Getters and Setters for model_name
    public String getModel_name() {
        return this.model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    // Getters and Setters for year
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter only for mileage
    public double getMileage() {
        return this.mileage;
    }
}