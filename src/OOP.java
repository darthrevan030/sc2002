public class OOP {

    public static void main(String[] args) {
        // Instantiate an instance of the User class
//        User u1 = new User(); // default constructor
//        u1.setName("Tom");
//        u1.setMembership("Basic");

//        User u2 = new User(); // default constructor
//        u2.setMembership("Premium");
//        u2.setName("Dick");
//        u2.setAge(1);

        // A more concise instantiation of the instances
        User u1 = new User("Tom", "Silver", 20);
        User u2 = new User("Dick", "Gold", 0);

        // Can also use the blank constructor since the new blank constructor method was implemented
        User u3 = new User();

        // getter
        System.out.println(u1.getName());
        System.out.println(u2.getName());

        System.out.println(u1.getMembership());
        System.out.println(u2.getMembership());

        System.out.println(u1.getAge()); // defaults to 0 since not set when instantiating each attribute individually
        System.out.println(u2.getAge());

        // setter
        u1.setMembership(User.Membership.GOLD);
        System.out.println(u1.getMembership());

        // blank instantiation
        System.out.println(u3.getMembership()); // defaults to Bronze
        System.out.println(u3.getAge()); // defaults to 0
        System.out.println(u3.getName()); // defaults to null

        // to string method override
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        User u4 = new User("Jeff", "Bronze", 25);
        User u5 = new User("Jeff", "Bronze", 25);

        // reference equality (==) - checks if same object in memory
        // comparison based on memory location --> same instance of an object
        System.out.println(u5 == u4); // false - different objects

        // These do the SAME thing if you don't override equals()
//        System.out.println(u1 == u2);        // false
//        System.out.println(u1.equals(u2));   // false (same as ==)

        // content equality after overriding equals (.equals()) - checks if objects have same values
        // comparison based on the attributes of the instances using method overriding
        System.out.println(u5.equals(u4)); // true - same name, membership, age
    }
}