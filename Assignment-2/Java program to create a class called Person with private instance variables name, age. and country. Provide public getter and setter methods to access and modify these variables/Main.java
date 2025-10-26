public class Main {
    public static void main(String[] args) {
        
        Person person1 = new Person();

        person1.setName("Ada Lovelace");
        person1.setAge(36);
        person1.setCountry("England");

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Country: " + person1.getCountry());
    }
}