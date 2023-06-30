package Day1.Bai7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // Thêm sách vào thư viện
        boolean added1 = lib.add(new Book("Harry Potter1", "J. K. Rowling"));
        boolean added3 = lib.add(new Book("Harry Potter2", "J. K. Rowling 2"));

        boolean added2 = lib.add(new Book("Theory of Everything", "Steven Hawking"));

        System.out.println(added1); // true
        System.out.println(added2); // true
        System.out.println(added3); // true
//
        List<Book> books = lib.getBooks();
//        for (Book book : books) {
//            System.out.println("Book: " + book.getTitle() + " - " + book.getAuthor());
//        }
//        // Xóa sách không tồn tại
//        boolean removed1 = lib.removeByTitle("Naruto");
//        System.out.println(removed1); // false
//
////        // Xóa sách dựa trên title
//        boolean removed2 = lib.removeByTitle("Harry Potter");
//        System.out.println(removed2); // true
//
//        books = lib.getBooks();
//        for (Book book : books) {
//            System.out.println("Book: " + book.getTitle() + " - " + book.getAuthor());
//        }
//
//
////        // Xóa sách dựa trên author
//        boolean removed3 = lib.removeByAuthor("Steven Hawking");
//        System.out.println(removed3); // true
////
//        books = lib.getBooks();
//        for (Book book : books) {
//            System.out.println("Book: " + book.getTitle() + " - " + book.getAuthor());
//        }
// Xóa sách bằng thuộc tính
        boolean removedAny = lib.remove(BookProp.name("Harry Potter1"));
        System.out.println(removedAny); // true

        books = lib.getBooks();
        for (Book book : books) {
            System.out.println("Book: " + book.getTitle() + " - " + book.getAuthor());
        }


        // Xóa sách bằng thuộc tính khác
        boolean removed2 = lib.remove(BookProp.author("J. K. Rowling 2"));
        System.out.println(removed2); // true

        books = lib.getBooks();
        for (Book book : books) {
            System.out.println("Book: " + book.getTitle() + " - " + book.getAuthor());
        }
    }
}
