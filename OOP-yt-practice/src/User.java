import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String _name;
    private String _membership = "NO MEMBERSHIP"; // set defaults
    private int _age = 0;
    private boolean _verified = false;

    public void setVerified(boolean verified){
        _verified = verified;
    }
    public boolean getVerified(){
        return _verified;
    }

    void verify(){
        System.out.println("User is verified");
        setVerified(true);
    }


    public static List<User> admins;

    public static void printAdminNames(){
        List <String> adminNames = new ArrayList<>();
        for (User u: User.admins) {
            adminNames.add(u.getName());
        }
        System.out.println(adminNames);
    }

    public static void printAdminList(){
        System.out.println(User.admins);
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", Membership: " + getMembership() + ", Age: " + getAge();
    }

    @Override
    public boolean equals(Object object){
        if (this == object){ // check reference value. if memory location is same then its the same instance
            return true;
        }

        if (object == null || getClass() != object.getClass()){ // check that comparing the same class of objects and prevent nullPointerException
            return false;
        }

        User user1 = (User) object; // cast Object to User
        if (getName().equals(user1.getName()) && getMembership().equals(user1.getMembership()) && getAge() == user1.getAge())
            return true;
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(_name, _membership, _age);
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
        BRONZE, SILVER,GOLD
    }

    public void setName(String name){
        _name = name;
    }
    public String getName(){
        return _name;
    }

    public void setMembership(String membership){
        _membership = membership;
    }
    public String getMembership(){
        return _membership;
    }

    public void setMembership(@NotNull Membership membership){
        _membership = membership.name();
    }

    public void setAge(int age){
        _age = age;
    }
    public int getAge(){
        return _age;
    }

}