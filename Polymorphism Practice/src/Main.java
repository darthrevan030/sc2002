//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();

        Eagle eagle = new Eagle();
        eagle.move();

        Tiger tiger = new Tiger();
        tiger.move();

        Shark shark = new Shark();
        shark.move();

        System.out.println(" ");
        System.out.println("Using Animal class as constructor instead");

        Animal animal_eagle = new Eagle();
        animal_eagle.move();

        Animal animal_shark = new Shark();
        animal_shark.move();

        Animal animal_tiger = new Tiger();
        animal_tiger.move();

        System.out.println(" ");
        System.out.println("Using call method in Animal class");

        Animal.call(new Eagle());
        Animal.call(new Tiger());
        Animal.call(new Shark());




    }
}