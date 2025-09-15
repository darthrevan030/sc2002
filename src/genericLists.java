import java.util.ArrayList;
import java.util.List;

public class genericLists {

    public static void main(String[] args) {
        // interface list     implementation array list
        List<User> users = new ArrayList<User>(); // interface list is more general

        users.add(new User("Caleb"));
        users.add(new User("David"));
        users.add(new User("Jack"));
        users.add(new User("Sam"));

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }

        for (User u : users) {
            System.out.println(u.getName());
        }

    }
}