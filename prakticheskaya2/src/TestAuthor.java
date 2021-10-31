import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Сергегев", "sergeev@mail.ru", 'M');
        Author a2 = new Author("Егоров", "egorov@gmail.com", 'M');
        Author a3 = new Author("Терева", "tereva@yandex.ru", 'R');

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }

}
