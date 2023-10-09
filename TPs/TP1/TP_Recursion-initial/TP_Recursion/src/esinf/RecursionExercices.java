/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

/**
 *
 */
public class RecursionExercices {
    
    /**
     *
     * @param m first parcel
     * @param n second parcel
     * @return the sum of the two parcels
     */
    public static int sum(int m, int n) {
        
        if (m == 0) {
            return n;

        } else {
            return sum(m - 1, n + 1);
        }
    }
    
    /**
     *
     * @param d number in decimal base
     * @return the number converted to binary base
     */
    public static String decimalToBinary(Integer d) {
        
        if (d == 0) {
            return "0";

        } else {
            return (d % 2) + decimalToBinary(d / 2);
        }       
    }
    
    /**
     *
     * @param d number to check
     * @return true if the number is a prime, false otherwise
     */
    public static boolean isPrime(int d) {
        
        return isPrime(d,2);
    }

    private static boolean isPrime(int d, int i) {
        
        if (d <= 1) {
            return false;
        }
        if (i <= 1) {
            return true;
        }
        if (d % i == 0) {
            return false;
        }
        return isPrime(d, i - 1);
    }
    
    /**
     *
     * @param word word to check
     * @return true if the word is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String word) {
        
        int size = word.length() - 1;
        if (size < 1) {
            return true;
        }

        if (word.charAt(0) != word.charAt(size)) {
            return false;
        }

        return isPalindrome(word.substring(1, size));
    }
    
}
