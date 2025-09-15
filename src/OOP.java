public class OOP {

    public static void main(String[] args) {
        System.out.println("Hello World");

        User u1 = new User();
        u1.setName("John");
        u1.setMembership("Basic");

        User u2 = new User();
        u2.setMembership("Premium");
        u2.setName("Harry");
        u2.setAge(1);

        System.out.println(u1.getName());
        System.out.println(u2.getName());

        System.out.println(u1.getMembership());
        System.out.println(u2.getMembership());

        System.out.println(u1.getAge()); // defaults to 0 since not set
        System.out.println(u2.getAge());

        u1.setMembership(User.Membership.Gold);
        System.out.println(u1.getMembership());
    }
}