package Day1.BaiTap4;

public class Main {
    public static void main(String[] args) {
        JPEGImage jpegImage = new JPEGImage();
        jpegImage.display();
        jpegImage.resize(800, 600);
        jpegImage.rotate(90);
        jpegImage.applyFilter();
    }
}
