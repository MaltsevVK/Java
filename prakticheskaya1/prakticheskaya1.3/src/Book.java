public class Book {
    public String author;
    public String book;

    public Book(String a, String b) {
        author = a;
        book = b;
    }
    public Book(String a) {
        author = a;
        book = "Пророк";
    }
    public Book() {
        author = "Александр Сергеевич Пушкин";
        book = "Пророк";
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setBook(String book) {
        this.book = book;
    }
    public String getAuthor() {
        return author;
    }
    public String getBook() {
        return book;
    }

    @Override
    public String toString() {
        return author+" написал книгу - "+book;
    }
}