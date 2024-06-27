package construct;

public class MemberThis {
    String nameField;


    // this 생략 가능 (자동으로 붙음)
    void initMember(String nameParameter){
        nameField = nameParameter;
    }
}
