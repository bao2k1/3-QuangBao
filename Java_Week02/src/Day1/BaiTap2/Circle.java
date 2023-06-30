package Day1.BaiTap2;

public class Circle extends Shape{
    private float bk;

    public Circle(float bk) {
        this.bk = bk;
    }

    @Override
    void calculateArea() {
        System.out.println("chu vi hinh tron la: "+bk*2*3.14);
    }

    @Override
    void calculatePerimeter() {
        System.out.println("dien tich hinh tron: "+bk*2*3.14);
    }

}
