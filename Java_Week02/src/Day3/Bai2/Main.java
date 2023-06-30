package Day3.Bai2;

// Lớp chính để thực thi
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng thư viện
        Library library = new Library();

        // Thêm sách vào thư viện
        library.addBook(new Book("Harry Potter", "J.K. Rowling", 5));
        library.addBook(new Book("Songoku", "Beerus", 3));
        library.addBook(new Book("Doraemon", "Japan", 2));

        // Hiển thị thông tin sách trong thư viện
        System.out.println("Books in Library:");
        library.displayBooks();

        // Tạo đối tượng thành viên
        Member member1 = new Member("Quang Bao");
        Member member2 = new Member("Son Tung");

        // Thành viên mượn sách
        boolean borrowResult = library.borrowBook("Harry Potter");
        if (borrowResult) {
            System.out.println(member1.getName() + " has borrowed the book.");
        } else {
            System.out.println("The book is not available for borrowing.");
        }

        // Hiển thị lại thông tin sách trong thư viện sau khi mượn
        System.out.println("\nUpdated Books in Library:");
        library.displayBooks();

        // Thành viên trả sách
        library.returnBook("Harry Potter");
        System.out.println(member1.getName() + " has returned the book.");

        // Hiển thị lại thông tin sách trong thư viện sau khi trả
        System.out.println("\nUpdated Books in Library:");
        library.displayBooks();
    }
}