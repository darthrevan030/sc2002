import java.util.ArrayList;
import java.util.List;

public class Inheritance {

    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.getVerified());
        s1.setMembership(User.Membership.GOLD); // automatically has this method
        System.out.println(s1.getMembership());

        Teacher t1 = new Teacher();
        System.out.println(t1.getVerified());
        t1.setMembership(User.Membership.BRONZE); // automatically has this method
        System.out.println(t1.getMembership());

        List<User> teachers = new ArrayList<User>();
        teachers = new ArrayList<User>();
        teachers.add(new User("Caleb"));
        teachers.add(new User("David"));
        teachers.add(new User("Jack"));


    }
}