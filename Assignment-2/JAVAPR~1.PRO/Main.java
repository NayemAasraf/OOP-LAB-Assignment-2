public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car(15000.5);

        myCar.setCompany_name("Toyota");
        myCar.setModel_name("Camry");
        myCar.setYear(2022);

        System.out.println("Company: " + myCar.getCompany_name());
        System.out.println("Model: " + myCar.getModel_name());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage() + " miles");
    }
}