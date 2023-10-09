package PL1.Ex1;
import java.util.Scanner;

public class c {

    public static int greatestDiv(int m, int n) {

        if (n == 0) {
            return m;

        } else {
            return greatestDiv(n, m % n);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira o 1º número: ");
        int m = input.nextInt();
        System.out.print("Insira o 2º número: ");
        int n = input.nextInt();
        System.out.println("O maior divisor comum é: " + greatestDiv(m, n));
    }
    
}
