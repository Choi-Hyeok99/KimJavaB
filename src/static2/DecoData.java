package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){

        //  instanceValue++; // 인스턴스 변수 접근 , compile error
        //  instanceMethod(); // 인스턴스 메서드 접근 , compile error
        // static은 static만 접근 할 수 있음

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall(){

        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }


    public static void staticCall(DecoData data){ // 참조값으로는 접근 가능 참조값이 있어야함
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod(){
        System.out.println("instancevalue="+ instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue=" + staticValue);
    }
}
