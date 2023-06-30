package Day1.Bai7;


import Day1.Bai7.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Library() {
        this.books = new ArrayList<>();
    }

    public boolean add(Book book) {

        for (Book existingBook : books) {
            if (existingBook.getTitle().equals(book.getTitle())) {
                return false; // Trùng title, không thêm sách mới
            }
            // Không trùng title, thêm sách mới vào danh sách

        }
        books.add(book);
        return true;
    }
        public boolean removeByTitle(String title) {
        // Tìm sách dựa trên title và xóa nếu tìm thấy
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return true;
            }
        }

        return false; // Không tìm thấy sách với title tương ứng
    }
        public boolean removeByAuthor(String author) {
        // Tìm sách dựa trên author và xóa nếu tìm thấy
        boolean removed = false;
        for (int i = books.size() - 1; i >= 0; i--) {
            Book book = books.get(i);
            if (book.getAuthor().equals(author)) {
                books.remove(i);
                removed = true;
            }
        }

        return removed; // Trả về true nếu có sách bị xóa, ngược lại trả về false
    }

    public boolean remove(BookProp prop) {
        // Tìm sách dựa trên thuộc tính và xóa nếu tìm thấy
        Iterator<Book> iterator = books.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (prop.getPropertyName().equals("title") && book.getTitle().equals(prop.getPropertyValue())) {
                iterator.remove();
                removed = true;
            } else if (prop.getPropertyName().equals("author") && book.getAuthor().equals(prop.getPropertyValue())) {
                iterator.remove();
                removed = true;
            }
        }

        return removed; // Trả về true nếu có sách bị xóa, ngược lại trả về false
    }
    public List<Book> getBooks() {
        return books;
    }

}
