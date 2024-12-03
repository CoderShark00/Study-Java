package c09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "빨강";
        myCar.drive();

        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.stop();


    }
}
