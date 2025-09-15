public class User {
    private String _name;
    private String _membership;
    private int _age;

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

    void setAge(int age){
        _age = age;
    }
    int getAge(){
        return _age;
    }

}