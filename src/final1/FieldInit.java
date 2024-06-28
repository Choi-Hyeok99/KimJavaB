package final1;

public class FieldInit {

    static final int CONST_VALUE = 10; // 곧용변수 , 바뀌지 않는 변수
    final  int value = 10;

    // 컴파일 오류
//    public FieldInit(int value) {
//        this.value = value;
//    }
}
