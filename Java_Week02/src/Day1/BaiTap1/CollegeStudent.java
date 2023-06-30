package Day1.BaiTap1;

public class CollegeStudent extends Student{
  private  String bangCap;

    public CollegeStudent(String maSo, String ten, int age, float dtb, String bangCap) {
        super(maSo, ten, age, dtb);
        this.bangCap = bangCap;
    }

    public CollegeStudent() {}
//    @Override
    public void thongTinSV(){
        System.out.println("Day la sinh vien cao dang");
    }
}
