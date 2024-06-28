package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // static 붙으니깐 클래스명으로 바로 호출 가능

        System.out.println("before : " + s);
        System.out.println("after  : " + deco);

    }
}
