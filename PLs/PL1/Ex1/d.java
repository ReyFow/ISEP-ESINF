package PL1.Ex1;
import java.util.Scanner;

public class d {

    public static int stringToInt(String sample, int size) {

        if (size < 0) {
            return 0;

        } else {
            return (sample.charAt(size) - '0') + stringToInt(sample, size - 1) * 10;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma String: ");
        String sample = input.nextLine();
        System.out.print(stringToInt(sample, sample.length() - 1));
    }
    
}
