package Day1.abstractClass;

import Day1.abstractClass.SportsCar;
import Day1.abstractClass.Car;

public class Main {
    public static void main(String[] args) {

        Car car= new SportsCar("BMW","black",2023,1000);
        car.start();
        car.stop();
        car.display();
    }
}
