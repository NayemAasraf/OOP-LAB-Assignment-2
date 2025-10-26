public class Main {
    public static void main(String[] args) {
        
        Smartphone phone1 = new Smartphone();
        
        phone1.setBrand("Samsung");
        phone1.setModel("Galaxy S24");
        phone1.setStorageCapacity(256);

        System.out.println("Brand: " + phone1.getBrand());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Initial Storage: " + phone1.getStorageCapacity() + "GB");

        System.out.println("\nIncreasing storage by 128GB...");
        phone1.increaseStorage(128);

        System.out.println("New Storage: " + phone1.getStorageCapacity() + "GB");

        System.out.println("\nTrying to increase by negative amount...");
        phone1.increaseStorage(-50);
        System.out.println("Storage (unchanged): " + phone1.getStorageCapacity() + "GB");
    }
}