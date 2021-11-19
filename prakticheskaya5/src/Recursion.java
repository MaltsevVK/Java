import java.util.Scanner;

public class Recursion {
    public static String nomer14(int N) {

        if (N < 10)
            return Integer.toString(N);
        else
            return nomer14(N / 10) + " " + N % 10;
    }
    public static int nomer15(int N) {
        if (N < 10)
            return N;
        else {
            System.out.print(N % 10 + " ");
            return nomer15(N / 10);
        }
    }
    public static void nomer16(int max, int count) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0) {
            if (N > max)
                nomer16(N, 1);
            else if (N == max)
                nomer16(max, ++count);
            else
                nomer16(max, count);
        }
        else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        System.out.print("Цифры числа слева направо: ");
        System.out.println(nomer14(1234567));

        System.out.print("Цифры числа справа налево: ");
        System.out.println(nomer15(1234567));

        System.out.print("Количество элементов, равных максимуму\n");
        nomer16(0,0);
        System.out.println();
    }
}
