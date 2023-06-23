package Day4;

import java.util.*;

public class BaiTapChieuBuoi4 {
    public static void main(String[] args) {
        int choose;
        Scanner sc=new Scanner(System.in);

        System.out.println("Chon bai tap ban muon chay nao!!!");

        int n= sc.nextInt();
        switch (n){
            case 3:
                //cau 3
                String text = "This is a sample text. This text contains some words. Some words may repeat.";
//        String text ="aaabc";
                hashMapAndCount(text);
                break;
            case 4:
                Election elec = new Election();

                elec.vote("Obama");
                elec.vote("Obama");

                elec.vote("Abraham Lincoln");
                elec.vote("Abraham Lincoln");

                String winner = elec.winner();
                System.out.println(winner); // "Abraham Lincoln - 2"
            case 5:
                //cau 5
                Product sanpham1= new Product("sach",120);
                Product sanpham2= new Product("sach",230);
                Product sanpham3= new Product("giay",1000);
                Product sanpham4= new Product("giay",2000);
                Product sanpham5= new Product("dep",3000);


                Inventory inventory= new Inventory();
                inventory.put(sanpham1);
                inventory.put(sanpham2);
                inventory.put(sanpham3);
                inventory.put(sanpham4);
                inventory.put(sanpham5);
                System.out.println("-----------All products-----------");
                System.out.println(inventory);
                inventory.getAllProducts();
                System.out.println("--------products ten sach--------");
                List<Product> productList = inventory.get("sach");
                for (Product product : productList) {
                    System.out.println(product);
                }

        System.out.println(inventory.remove("giay"));
                System.out.println("-----------products sau khi xoa giay-----------");
        inventory.getAllProducts();
                System.out.println("-----------Tong gia ten sach-----------");
                System.out.println(inventory.totalPriceOf("sach")) ;
                System.out.println("-----------Tong sach -----------");
                System.out.println(inventory.countTotal("sach")) ;
                break;
            default:
                System.out.println("Not found !!!");
                break;
        }


    }
    public static void hashMapAndCount(String text){
        String[] words = text.split(""); // Tách các từ
        // Tạo một HashMap để đếm tần suất xuất hiện của từng từ
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // In ra các từ và tần suất xuất hiện của chúng
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(word + ": " + frequency);
        }
    }
}
