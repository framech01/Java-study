package static1.ex;

public class CarMain {
    public static void main(String[] args) {
        //instance
        Car car1=new Car("K3");
        Car car2=new Car("G80");
        Car car3=new Car("Model Y");

        //showTotalCars은 static 이겠구나
        Car.showTotalCars();
    }
}
