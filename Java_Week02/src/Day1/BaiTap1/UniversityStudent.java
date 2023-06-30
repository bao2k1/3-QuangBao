package Day1.BaiTap1;

public class UniversityStudent extends Student{
    private String bangCap;

    public UniversityStudent(String maSo, String ten, int age, float dtb, String bangCap) {
        super(maSo, ten, age, dtb);
        this.bangCap = bangCap;
    }

    public UniversityStudent() {}

    public void thongTinSV(){
        System.out.println("Day la sinh vien dai hoc");
    }
}
