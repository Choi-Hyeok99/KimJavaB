package extends1.overriding;

public class ElectricCar extends Car {

    @Override // ( 메서드 오버라이딩 )  && 재정의 && 필수는 아니지만 명확성을 위해 붙이는게 좋다.
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");

    }
    public void charge(){
        System.out.println("차를 충전합니다.");
    }
}
