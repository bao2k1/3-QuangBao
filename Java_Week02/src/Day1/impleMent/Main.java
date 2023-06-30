package Day1.impleMent;

public class Main {
    public static void main(String[] args) {
        Car sportCar=new SportCar("BMW");
        sportCar.start();
        sportCar.drive(1000);

        sportCar.stop();
        System.out.println("--------------------------");
        Car sedanCar=new SportCar("Sedan");
        sedanCar.start();
       sedanCar.drive(300);
        sedanCar.stop();
    }
}
