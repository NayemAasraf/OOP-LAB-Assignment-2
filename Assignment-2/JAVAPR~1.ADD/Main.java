public class Main {
    public static void main(String[] args) {
        
        Desktop myPC = new Desktop();
        
        myPC.setBrand("Dell");
        myPC.setProcessor("Intel i7");
        myPC.setRamSize(16);

        System.out.println("Brand: " + myPC.getBrand());
        System.out.println("Processor: " + myPC.getProcessor());
        System.out.println("Initial RAM: " + myPC.getRamSize() + "GB");

        System.out.println("\nUpgrading RAM by 8GB...");
        myPC.upgradeRam(8);

        System.out.println("New RAM: " + myPC.getRamSize() + "GB");
        
        System.out.println("\nTrying to upgrade by -4GB...");
        myPC.upgradeRam(-4);
        System.out.println("RAM (unchanged): " + myPC.getRamSize() + "GB");
    }
}