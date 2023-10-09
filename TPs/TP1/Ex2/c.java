package TP1.Ex2;
import java.util.Scanner;

public class c {

    public static boolean isPrime(int n, int divisor) {

        if (n <= 1) {
            return false;
        }
        if (divisor <= 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor - 1);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int n = input.nextInt();

        if (isPrime(n, (int) Math.sqrt(n))) {
            System.out.println(n + " é número primo");
        } else System.out.println(n + " não é número primo");
    }
}
