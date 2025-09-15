import java.util.List;

public class Student extends User {

    void verify() {
        System.out.println("Student is verified");
        setVerified(true);
    }


}