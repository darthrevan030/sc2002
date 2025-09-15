import java.util.List;

public class Teacher extends User {

    void verify(){
        System.out.println("Teacher is verified");
        setVerified(true);
    }
}