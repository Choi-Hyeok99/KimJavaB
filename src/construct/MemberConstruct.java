package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자는 클래스 이름과 동일 다르면 컴파일 오류 발생
    // 생성자는 반환타입 x 없다
    MemberConstruct(String name , int age, int grade){
        System.out.println("생성자 호출 name = " + name + "age =" + age + "grade = "+ grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
