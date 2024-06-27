package access.ex;

public class MaxCounter {

    private int counter = 0;
    private int max;


    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if (counter >= max ){
            // 검증로직
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행로직
        counter++;
    }
    public int getCount() {
        return counter;
    }
}
