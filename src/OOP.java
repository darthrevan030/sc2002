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
        User u1 = new User("Tom", "Mid", 20); // can no longer have non-set attributes if
        User u2 = new User("Dick", "Gold", 0); // instantiating like this

        System.out.println(u1.getName());
        System.out.println(u2.getName());

        System.out.println(u1.getMembership());
        System.out.println(u2.getMembership());

        System.out.println(u1.getAge()); // defaults to 0 since not set when instantiating individually
        System.out.println(u2.getAge());

        u1.setMembership(User.Membership.Gold);
        System.out.println(u1.getMembership());
    }
}