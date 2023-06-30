package Day1.BaiTap2;

public class Rectangle extends Shape {
    private float dai;
    private float rong;

    public Rectangle(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public Rectangle(){}

    @Override
    void calculateArea() {
        System.out.println("chu vi hcn la: "+(dai+rong)/2);
    }

    @Override
    void calculatePerimeter() {
        System.out.println("dientich hcn la: "+(dai*rong));
    }
}
