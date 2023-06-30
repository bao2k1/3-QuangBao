package Day1.impleMent;

public class SportCar implements Car{
    private String brand;

    public SportCar(String brand) {
        this.brand = brand;
    }
    @Override
    public void start(){
        System.out.println(brand+ "sports car start");
    }

    @Override
    public void stop() {
        System.out.println(brand+ "sports car stop");
    }

    @Override
    public void drive(double distance) {
        System.out.println(brand+ "sports car drive"+distance+"km");
    }
}
