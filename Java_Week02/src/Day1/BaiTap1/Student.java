package Day1.BaiTap1;

public class Student {
    private String maSo;
    private String ten;
    private int age;

    private float dtb;


    public Student(String maSo, String ten, int age, float dtb) {

        this.maSo = maSo;
        this.ten = ten;
        this.age = age;
        this.dtb = dtb;

    }

    public Student() {}

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }


}
