package Day4;

import java.util.*;

public class BaiTapBuoi4 {

    public static void main(String[] args) {
        int choose;
        Scanner sc=new Scanner(System.in);

        System.out.println("Chon bai tap ban muon chay nao!!!");

        int n= sc.nextInt();
        switch (n){
            case 1:
                //Cau 1
                System.out.println("------cau 1------");
                ArrayList<Integer> bai1 = new ArrayList<>(List.of(1,2,3));
                System.out.println(tongCacSo(bai1));
                break;
            case 2:
                //Cau 2
                System.out.println("------cau 2------");
                ArrayList<String> bai2 = new ArrayList<>(List.of("A","B","C","A"));
                System.out.println(ArrListToHashSet(bai2));
                break;

            case 3:
                //Cau3
                System.out.println("------cau 3------");
                LinkedList<String> bai3 = new LinkedList<>(List.of("A","B","C","D"));
                System.out.println("Danh sách sau khi đảo ngược: " + reverseLL(bai3));
                break;

            case 4:
                //Cau4
                ArrayList<Integer> bai4 = new ArrayList<>(List.of(1,2,3,4));
                System.out.println("Phan tu max: " + findMaxElement(bai4));
                break;

            case 5:
                //Cau5
                HashMap<String, Integer> studentScores = new HashMap<>();
                studentScores.put("John", 85);
                studentScores.put("Alice", 92);
                studentScores.put("Bob", 76);
                studentScores.put("Emily", 88);
                dsSV(studentScores);
                break;

            case 6:

                //Cau6
                ArrayList<Object> bai6 = new ArrayList<>(List.of("A", "B", "C", 1));
                System.out.println(checkValue(bai6, "A"));
                break;

            case 7:
                //cau7
                ArrayList<String> bai7 = new ArrayList<>(List.of("A", "C", "B", "N"));
                System.out.println(sortChar(bai7));
                break;

                case 8:
                //cau8
                ArrayList<Integer> bai8 = new ArrayList<>(List.of(3,7,2,1,9,9));
                System.out.println(treeSetFormArr(bai8));
                    break;

                case 9:

                //cau9
                ArrayList<String> bai9 = new ArrayList<>(List.of("a","b","c","d","a"));
                System.out.println(hashSetFromArr(bai9));
                    break;

            case 10:
                //cau10
                ArrayList<String> bai10 = new ArrayList<>();
                bai10.add("a");
                bai10.add("b");
                bai10.add("v");
                bai10.add("v");
                bai10.add("e");
                bai10.add("a");

                System.out.println(deleteDup(bai10));
                break;

            case 11:
                //cau11
                ArrayList<Object> bai11 = new ArrayList<>(List.of("a","b","c",1));
                copyArr(bai11);
                break;

            case 12:
                //cau12
                String text = "This is a sample text. This text contains some words. Some words may repeat.";
                treeMapAndCount(text);
                break;

            case 13:
                //cau13
                LinkedList<Object>bai13 = new LinkedList<>(List.of("a","b","c",1,1,"c"));
                System.out.println("so lan xuat hien phan tu can tim la: "+countElement(bai13,"c"));
                break;

            case 14:
                //cau14
                ArrayList<Object> bai14 = new ArrayList<>(List.of());
                System.out.println("arrList tren rong dung khong? "+isEmpty(bai14));
                break;

            case 15:
                //cau 15
                ArrayList<Object> bai15 = new ArrayList<>(List.of("a","b","c",1,"c"));
                System.out.println("arr sau khi chen mot phan tu: "+insertEmlement(bai15,2,"N"));
                break;

            case 16:
                //cau 16
                ArrayList<String> bai16 = new ArrayList<>(List.of("a","c","b","2"));
               priorityFromArr(bai16);
                break;

            case 17:
                //cau17
                ArrayList<String> bai17a = new ArrayList<>(List.of("a","c","b"));
                List<String> bai17b =List.of("a","c");
                System.out.println("arrList chua tat ca cac phan tu cua list? "+checkArrayListContainsAllElements(bai17a,bai17b));
                break;

            case 18:
                //cau18
                LinkedList<Integer> bai18 =new LinkedList<>(List.of(1,2,3,4,5));
                System.out.println("Sap xep giam dan: "+sortGiamdan(bai18));
                break;

            case 19:

                //cau19
                Object[] array = {"apple", "banana", 1,6, "apple", "grape"};
                System.out.println("Hashset from arr: ");
                ArrToHashSet(array);
                break;

            case 20:
                //cau20
                ArrayList<?> bai20 = new ArrayList<>(List.of("a","c","4"));
                FirstAndLastElement(bai20);
            default:
                System.out.println("Not found !!!");
                 break;
        }




    }

    public static int tongCacSo(ArrayList<Integer> arr){
        int sum=0;
        for (int item:arr) {
            sum+=item;
        }
        return sum;
    }

    public static HashSet<String> ArrListToHashSet(ArrayList<String> arr){
        HashSet<String> hashSet = new HashSet<>(arr);
        // In các phần tử trong HashSet

        return  hashSet;
    }
    public static LinkedList<String> reverseLL(LinkedList<String> list){
        System.out.println("Danh sách ban đầu: " + list);
        // Đảo ngược thứ tự các phần tử trong LinkedList
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static int findMaxElement(ArrayList<Integer> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            throw new IllegalArgumentException("ArrayList không hợp lệ hoặc rỗng.");
        }

        int max = arrayList.get(0); // Giả sử phần tử đầu tiên là lớn nhất

        for (int i = 1; i < arrayList.size(); i++) {
            int element = arrayList.get(i);
            if (element > max) {
                max = element;
            }
        }

        return max;
    }
    public static void dsSV(HashMap<String, Integer> students) {
        // In ra tất cả các mục trong HashMap
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println("Tên: " + name + ", Điểm số: " + score);
        }
    }
    public static <T> boolean checkValue(ArrayList<T> arr, T value) {
        return arr.contains(value);
    }

    public  static ArrayList<String> sortChar(ArrayList<String> arr){
        Collections.sort(arr);
        return arr;
    }
    public static TreeSet<Integer> treeSetFormArr(ArrayList<Integer> arr){
        TreeSet<Integer> treeSet = new TreeSet<>(arr);

        // In ra tất cả các phần tử trong TreeSet theo thứ tự tăng dần
       return treeSet;
    }
    public static HashSet<String> hashSetFromArr(ArrayList<String> arr){
        HashSet<String> hashSet = new HashSet<>(arr);

        // In ra tất cả các phần tử trong HashSet
       return hashSet;
    }
    public static ArrayList<String> deleteDup(ArrayList<String> arr){
        HashSet<String> uniqueSet = new HashSet<>(arr);

        // Tạo lại ArrayList từ HashSet để loại bỏ các phần tử trùng lặp
        ArrayList<String> uniqueArrayList = new ArrayList<>(uniqueSet);

        // In ra các phần tử duy nhất trong ArrayList
       return uniqueArrayList;
    }
    public static <T> void copyArr(ArrayList<T> arr){
        System.out.println("Mang ban dau la: "+arr);
        ArrayList<T> copyArrayList = new ArrayList<>(arr);
        System.out.println("Mang copy la: "+copyArrayList);
    }
    public static void treeMapAndCount(String text){
        String[] words = text.split("\\s+"); // Tách các từ bằng khoảng trắng
        // Tạo một HashMap để đếm tần suất xuất hiện của từng từ
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        // Chuyển đổi HashMap thành TreeMap để sắp xếp các từ theo thứ tự tự nhiên
        TreeMap<String, Integer> wordFrequencyMap = new TreeMap<>(wordCountMap);

        // In ra các từ và tần suất xuất hiện của chúng
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            String word = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(word + ": " + frequency);
        }
    }

    public static <T> int countElement(LinkedList<T> linkedList, T element) {
        int count = 0;
        for (T item : linkedList) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static  <T> boolean isEmpty(ArrayList<T> arr){
        return arr.isEmpty();
    }

    public static <T> ArrayList insertEmlement(ArrayList<T> arr,int place,T value){
        arr.add(place-1,value);
        return arr;
    }

    public static <T> void priorityFromArr(ArrayList<T> arr){
        PriorityQueue<T> priorityQueue = new PriorityQueue<>(arr);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

    }
    public static <T> boolean checkArrayListContainsAllElements(ArrayList<T> arrayList, List<T> list) {
        return arrayList.containsAll(list);
    }
    public static LinkedList<Integer> sortGiamdan(LinkedList<Integer> list){
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
    public static <T> void ArrToHashSet(T[] arr) {
        System.out.println(Arrays.toString(arr));
        HashSet<T> hashSet = new HashSet<>(Arrays.asList(arr));

        // In các phần tử trong HashSet
        for (T element : hashSet) {
            System.out.println(element);
        }
    }
    public static <T> void FirstAndLastElement(ArrayList<T>arr){
        System.out.println("phan tu dau tien la: "+arr.get(0));
        System.out.println("phan tu cuoi cung la: "+arr.get(arr.size()-1));

    }

}
