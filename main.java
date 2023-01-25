public class main {
    public static void main(String[] args) {
        EncapsulationExample person = new EncapsulationExample();
        person.setName("John Doe");
        person.setAge(30);
        person.setAddress("123 Main St");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}