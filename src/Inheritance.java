import java.util.ArrayList;
import java.util.List;

public class Inheritance {

    public static void main(String[] args) {

        Student s1 = new Student();
//        System.out.println(s1.getVerified());
//        s1.setMembership(User.Membership.GOLD); // automatically has this method
//        System.out.println(s1.getMembership());
        s1.setName("S1");

        Teacher t1 = new Teacher();
//        System.out.println(t1.getVerified());
//        t1.setMembership(User.Membership.BRONZE); // automatically has this method
//        System.out.println(t1.getMembership());
        t1.setName("T1");

        User.admins = new ArrayList<User>();
        User.admins.add(t1);
        User.admins.add(s1);
        User.admins.add(new User("Admin"));

        User.printAdminNames();

        for (User u : User.admins){
            u.verify();
        }
        User.printAdminList();


    }
}