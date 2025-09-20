public class Animal {

    public void move(){
        System.out.println("Animal Move");
    }

    public static void call(Animal animal){
        animal.move();
    }
}