public class OOP {

    public static void main(String[] args) {
        System.out.println("Hello World");

        User u1 = new User();
        u1.name = "John";
        u1.membership = "Basic";

        User u2 = new User();
        u2.membership = "Premium";
        u2.name = "Harry";
        u2.age = 1;

        System.out.println(u1.name);
        System.out.println(u2.name);

        System.out.println(u1.age); // defaults to 0 since not set
        System.out.println(u2.age);
    }
}
