public class OOP {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Instantiate an instance of the User class
//        User u1 = new User(); // default constructor
//        u1.setName("Tom");
//        u1.setMembership("Basic");

//        User u2 = new User(); // default constructor
//        u2.setMembership("Premium");
//        u2.setName("Dick");
//        u2.setAge(1);

        // A more concise instantiation of the instances
        User u1 = new User("Tom", "Mid", 20);
        User u2 = new User("Dick", "Gold", 0);

        // Can also use the blank constructor since the new blank constructor method was implemented
        User u3 = new User();

        System.out.println(u1.getName());
        System.out.println(u2.getName());

        System.out.println(u1.getMembership());
        System.out.println(u2.getMembership());

        System.out.println(u1.getAge()); // defaults to 0 since not set when instantiating each attribute individually
        System.out.println(u2.getAge());

        u1.setMembership(User.Membership.Gold);
        System.out.println(u1.getMembership());

        System.out.println(u3.getMembership()); // defaults to Bronze
        System.out.println(u3.getAge()); // defaults to 0
        System.out.println(u3.getName()); // defaults to null

    }
}