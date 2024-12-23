package static1.ex;

public class Car {

    private String name;
    private static int count;

    //생성자
    public Car(String name){
        this.name=name;
        count++;
    }
    //static variable을 활용한 static method
    public static void showTotalCars(){
        System.out.println(count);

    }
}
