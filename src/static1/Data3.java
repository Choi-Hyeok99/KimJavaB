package static1;

public class Data3 {

    public String name;
    public static int count; // static


    public Data3(String name){
        this.name = name;
        count++; // Data3.count++; 으로 해야하나 같은 클래스 내 생략 가능
    }
}
