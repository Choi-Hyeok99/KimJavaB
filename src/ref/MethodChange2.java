package ref;

public class MethodChange2 {
    public static void main(String[] args) {

        // 참조형

        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);

    }
    public static void changeReference(Data dataX){
        dataX.value = 20;
    }
}
// 같은 참조 ( 같은 인스턴스 )
//메서드 호출 전 : dataA.value = 10
//메서드 호출 후 : dataA.value = 20
