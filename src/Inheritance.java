import java.util.ArrayList;
import java.util.List;

public class Inheritance {

    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.getVerified());
        s1.setMembership(User.Membership.GOLD); // automatically has this method
        System.out.println(s1.getMembership());

        List<User> users = new ArrayList<User>();
        User.admins = new ArrayList<User>();
        users.add(new User("Caleb"));
        users.add(new User("David"));
        users.add(new User("Jack"));


    }
}