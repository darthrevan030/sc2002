import java.util.List;

public class User {
    private String _name;
    private String _membership = "Bronze"; // set defaults
    private int _age = 0;

    public static List<User> admins;

    public String toString() {
        return "Name: " + getName() + ", Membership: " + getMembership() + ", Age: " + getAge();
    }

    public boolean equals(User user1){
        if (getName() == user1.getName() && getMembership() == user1.getMembership() && getAge() == user1.getAge())
            return true;
        else {
            return false;
        }
    }

    // constructor for blank
    public User(){
    }

    // constructor for just name
    public User(String name) {
        setName(name);
    }

    // more concise constructor
    public User(String name, String membership, int age){
        setName(name);
        setMembership(membership);
        setAge(age);
    }

    public enum Membership {
        Bronze, Silver, Gold
    }

    void setName(String name){
        _name = name;
    }
    String getName(){
        return _name;
    }

    void setMembership(String membership){
        _membership = membership;
    }
    String getMembership(){
        return _membership;
    }

    void setMembership(Membership membership){
        _membership = membership.name();
    }

    void setAge(int age){
        _age = age;
    }
    int getAge(){
        return _age;
    }

}