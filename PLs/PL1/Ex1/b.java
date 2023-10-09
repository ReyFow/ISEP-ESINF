package PL1.Ex1;
import java.util.Scanner;

public class b {

    public static int productCalc(int m, int n) {

        if (m == 0 || n == 0) {
            return 0;

        } else {
            return m + productCalc(m, n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira o 1º número: ");
        int m = input.nextInt();
        System.out.print("Insira o 2º número: ");
        int n = input.nextInt();
        System.out.println(m + " x " + n + " = " + productCalc(m, n));
    }
    
}
