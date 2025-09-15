public class Student extends User {

    private boolean _verified = false;

    void setVerified(boolean verified){
        _verified = verified;
    }
    boolean getVerified(){
        return _verified;
    }



}