package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {


        // 기존 아무것도 적용 안한 코드
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

//        Caw[] cawarr = {dog,cat,caw};

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        sound(cat);
        sound(caw);

    }
    private static void sound(Caw caw){
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void sound(Cat cat){
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
