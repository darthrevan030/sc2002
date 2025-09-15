import java.util.ArrayList;
import java.util.List;

public class genericLists {

    public static void main(String[] args) {
        // interface list     implementation array list
        List<User> users = new ArrayList<User>(); // interface list is more general

        User.admins = new ArrayList<User>();

        users.add(new User("Caleb"));
        users.add(new User("David"));
        users.add(new User("Jack"));
        users.add(new User("Sam"));

        User.admins.add(new User("Mary"));
        User.admins.add(new User("Ben"));


        // 2 kinds of for loops
        // print all users in the list
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }

        for (User u : users) {
            System.out.println(u.getName());
        }

        // print all Admins in the list
        for (int j = 0; j < User.admins.size(); j++) {
            System.out.println(User.admins.get(j).getName());
        }

        User.printAdminNames();
    }
}