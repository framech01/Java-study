package access.ex;

public class MaxCounter {

    //data 숨기기
    private int count;
    private int max;

    //생성자 max 초기값 설정 다른 패키지에서도 사용하는 조건때문에 public으로
    public MaxCounter(int a) {
        max = a;
    }

    void increment(){
        if(count < max){
            count++;
        }
        else{
            System.out.println("Max count reached");
        }
    }
    int getCount(){
        return count;
    }
}
