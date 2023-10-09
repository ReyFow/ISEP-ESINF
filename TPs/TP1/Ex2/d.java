package TP1.Ex2;

import java.util.Scanner;

public class d {
    
    public static boolean isPalindrome(String sampleStr, int size) {

        if (size < 1) {
            return true;
        }

        if (sampleStr.charAt(0) != sampleStr.charAt(size)) {
            return false;
        }

        return isPalindrome(sampleStr.substring(1, size), size - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int sample = input.nextInt();

        String sampleStr = Integer.toString(sample);
        
        if (isPalindrome(sampleStr, sampleStr.length() - 1)) {
            System.out.print(sample + " é palindromo!");
        } else System.out.print(sample + " não é palindromo!");
    }
}
