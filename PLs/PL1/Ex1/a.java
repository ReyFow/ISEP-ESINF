package PL1.Ex1;
import java.util.Scanner;

public class a {

    public static String reverseString(String sample, int size) {

        if (size < 0) {
            return sample;

        } else {
            return sample.charAt(size) + reverseString(sample.substring(0, size), size - 1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma String: ");
        String sample = input.nextLine();
        System.out.print(reverseString(sample, sample.length() - 1));
    }
    
}
