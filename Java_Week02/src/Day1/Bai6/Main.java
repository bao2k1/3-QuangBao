package Day1.Bai6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPhone ip01 = new IPhone(List.of(new Photo("cat.jpg")));
        IPhone ip02 = new IPhone();

        ip01.airdrop(ip02, "cat.jpg");

        System.out.println(ip02.getPhotos()); // Output: [Photo("cat.jpg")]
    }
}