package PL1.Ex1;
import java.util.Scanner;

public class f {

    public static void fillMatriz(int[][] sample, int i, int j, int counter) {
        if (i == sample.length) {
            return;

        } else if (j == sample[i].length) {
            fillMatriz(sample, i + 1, 0, counter);

        } else {
            sample[i][j] = counter;
            counter++;
            fillMatriz(sample, i, j + 1, counter);

        }
    }

    public static int iterativeSum(int[][] sample, int n) {

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += sample[i][j];
            }
        }
        return sum;
    }

    public static int recursiveSum(int[][] sample, int i, int j) {

        if (i == sample.length) {
            return 0;

        } else if (j == sample[i].length) {
            return recursiveSum(sample, i + 1, 0);

        } else {
            return sample[i][j] + recursiveSum(sample, i, j + 1);
        }
    }

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a dimensão da matriz: ");
        int n = input.nextInt();

        int[][] sample = new int[n][n];
        fillMatriz(sample, 0, 0, 1);

        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + sample[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("Soma iterativa: " + iterativeSum(sample, n));
        System.out.println("Soma recursiva: " + recursiveSum(sample, 0, 0));
    }
}
