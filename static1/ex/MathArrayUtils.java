package static1.ex;

public class MathArrayUtils {
    private static int result;


    //생성자를 private로 만들어서 instance 생성 제한
    private MathArrayUtils() {

    }
    public static void sum(int[] array){
        for (int i=0;i<array.length;i++) {
            result += array[i];
        }
        System.out.println(result);
    }

    public static void average(int[] array){
        result = result / array.length;
        System.out.println(result);
    }

    public static void min(int[] array){
        int min = array[0];
        for (int i=0;i<array.length;i++) {
            if(array[i] < min){
                min=array[i];
            }
        }
        result=min;
        System.out.println(result);
    }

    public static void max(int[] array){
        int max = array[0];
        for (int i=0;i<array.length;i++) {
            if(array[i] > max){
                max=array[i];
            }
        }
        result=max;
        System.out.println(result);
    }

}
