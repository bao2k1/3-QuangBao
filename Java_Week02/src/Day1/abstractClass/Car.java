package Day1.abstractClass;
abstract  class Car {
    private String brand;
    private String color;
    private int year;

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public abstract void start();
//    public void drive(){
//        System.out.println("The car is driving");
//    }
    public void stop(){
        System.out.println("The car is stopped");
    }
    public void display(){
        System.out.println("The brand: "+brand);
        System.out.println("The brand: "+color);
        System.out.println("The brand: "+year);

    }
}
