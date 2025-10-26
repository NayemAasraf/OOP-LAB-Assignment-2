public class Desktop {

    private String brand;
    private String processor;
    private int ramSize;

    // Getters
    public String getBrand() {
        return this.brand;
    }

    public String getProcessor() {
        return this.processor;
    }

    public int getRamSize() {
        return this.ramSize;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ramSize) {
        if (ramSize > 0) {
            this.ramSize = ramSize;
        } else {
            System.out.println("Initial RAM size must be positive.");
        }
    }

    // Method to upgrade RAM
    public void upgradeRam(int amount) {
        if (amount > 0) {
            this.ramSize = this.ramSize + amount;
        } else {
            System.out.println("Amount to upgrade must be positive.");
        }
    }
}