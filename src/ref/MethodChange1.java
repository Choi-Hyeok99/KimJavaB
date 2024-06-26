package ref;

public class MethodChange1 {
    public static void main(String[] args) {

        // 기본형

        int a = 10;
        System.out.println("메소드 호출 전 : a = " + a);
        changePrimitive(a);
        System.out.println("메소드 호출 후 : a = " + a);
    }
    public static void changePrimitive(int x){
        x = 20;
    }
}
//메소드 호출 전 : a = 10
//메소드 호출 후 : a = 10