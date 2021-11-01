import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book a1 = new Book("Лев Николаевич Толстой", "Война и мир");
        Book a2 = new Book("Н.В.Гоголь");
        Book a3 = new Book();

        a2.setBook("Тарас Бульба");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}