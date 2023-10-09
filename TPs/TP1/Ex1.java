package TP1;

public class Ex1 {

    public static void process(int a[], int liminf, int limsup) {

        int i = liminf;
        int j = limsup - 1;

        while (i < j) { 
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        } 
    }

    public static void example(int[] a, int li, int ls) {

        if (li < ls) {
            process(a, li, ls);
            System.out.printf("\nNova ordem (posições ["+li+"] - ["+(ls-1)+"] ordenadas): ");
            for (int i = 0; i < 8; i++) {
                System.out.print(a[i]);
            }
            ls = ls/2;
            example(a, li, ls);
        } 
    }

    public static void main(String[] args) {

        int a[] = {6,1,4,2,7,3,1,5};

        System.out.print("Ordem inicial: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(a[i]);
        }

        example(a,0,8);

        System.out.print("\nOrdem final: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(a[i]);
        }
    }
}
