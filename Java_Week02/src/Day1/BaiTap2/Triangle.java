package Day1.BaiTap2;

public class Triangle extends Shape{

    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    float nuaCV(){
        return (a+b+c)/2;
    }
    @Override
    void calculateArea() {
        System.out.println("chu vi hinh tam giac: "+(a+b+c));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("chu vi hinh tron la: "+Math.sqrt(nuaCV()*(nuaCV()-a)*(nuaCV()-b)*(nuaCV()-c)));
    }
}
