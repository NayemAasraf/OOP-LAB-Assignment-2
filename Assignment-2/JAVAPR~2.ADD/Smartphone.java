public class Smartphone {

    private String brand;
    private String model;
    private int storageCapacity;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return this.storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity > 0) {
            this.storageCapacity = storageCapacity;
        }
    }

    public void increaseStorage(int amount) {
        if (amount > 0) {
            this.storageCapacity = this.storageCapacity + amount;
        } else {
            System.out.println("Amount to increase must be positive.");
        }
    }
}