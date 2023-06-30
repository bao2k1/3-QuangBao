package Day1.impleMent;

public class Sedan implements Car{
    private String brand;

    public Sedan(String brand) {
        this.brand = brand;
    }
    @Override
    public void start(){
        System.out.println(brand+ "sedan car start");
    }

    @Override
    public void stop() {
        System.out.println(brand+ "sedan car stop");
    }

    @Override
    public void drive(double distance) {
        System.out.println(brand+ "sedan car drive "+distance+" km");
    }
}
