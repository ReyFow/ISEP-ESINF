package TP1.Ex2;
import java.util.Scanner;

public class a {

    public static int sumCalc(int m, int n) {

        if (m == 0) {
            return n;

        } else {
            return sumCalc(m - 1, n + 1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira o 1º número: ");
        int m = input.nextInt();
        System.out.print("Insira o 2º número: ");
        int n = input.nextInt();
        System.out.println(m + " + " + n + " = " + sumCalc(m, n));
    }
}
