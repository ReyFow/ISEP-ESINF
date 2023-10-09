package TP1.Ex2;

import java.util.Scanner;

public class b {

    public static String decToBin(int n) {

        if (n == 0) {
            return "0";

        } else {
            return (n % 2) + decToBin(n / 2);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int n = input.nextInt();
        System.out.println(decToBin(n));
    }
}
