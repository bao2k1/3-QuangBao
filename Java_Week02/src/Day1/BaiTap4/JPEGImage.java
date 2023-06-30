package Day1.BaiTap4;

public class JPEGImage extends Image implements Filter{
    @Override
    public void display() {
        System.out.println("Displaying JPEG image");
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("Resizing JPEG image to width: " + width + ", height: " + height);
    }

    @Override
    public void rotate(int angle) {
        System.out.println("Rotating JPEG image by angle: " + angle);
    }

    @Override
    public void applyFilter() {
        System.out.println("Applying filters to JPEG image");
    }
}
