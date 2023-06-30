package Day1.abstractClass;

import Day1.abstractClass.Car;

class SportsCar extends Car {
    private int price;
    public SportsCar(String brand, String color, int year,int price) {
        super(brand, color, year);
        this.price=price;
    }
    @Override
    public void start(){
        System.out.println("Sports car is starting with a road!");
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Price: "+this.price);
    }

}
