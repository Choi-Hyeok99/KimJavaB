package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(caw);
        soundAnimal(cat);
        soundAnimal(duck);
    }
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
