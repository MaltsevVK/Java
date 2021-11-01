import java.lang.*;

public class TestDog {
    public static void main(String[] args) {
        Dog a1 = new Dog("Molly", 3);
        Dog a2 = new Dog("Trap");
        Dog a3 = new Dog();
        a3.setAge(6);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(" ");

        a1.intoHumanAge();
        a2.intoHumanAge();
        a3.intoHumanAge();
    }
}