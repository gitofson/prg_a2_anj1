package cz.spsmb.a2.sort;

import java.util.Arrays;

public class BubbleSort {
    public static int sort1(int[] pole) {
        int pocet = 0;
        boolean proh = true;
        int i = 0;
        while (proh) {
            proh = false;
            for (int j = 0; j < pole.length - i - 1; j++) {

                if (pole[j + 1] < pole[j]) {
                    pocet++;
                    int p = pole[j];
                    pole[j] = pole[j + 1];
                    pole[j + 1] = p;
                    proh = true;
                }
            }
            for (int polozka : pole) {
                System.out.print(polozka + " ");
            }
            System.out.println("");
            i++;
        }
        return pocet;
    }
    public static int sort2(int[] pole){
        int pocet = 0;
        for (int i = 0; i < pole.length - 1; i++) {
            //for (int j = 0; j < pole.length - 1 ; j++) { //neoptimalizovaná varianta
            for (int j = 0; j < pole.length - 1 - i; j++) { //optimalizovaná varianta

                if(pole[j] > pole[j+1]) {
                    pocet++;
                    int tmp = pole[j+1];
                    pole[j+1] = pole[j];
                    pole[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(pole));
        }
        return pocet;
    }
    public static void main(String[] args) {
        int[] pole = {1, 2, 3, 4, 1, 6, 7, 9, 2};
        int pocet = BubbleSort.sort1(pole);
        System.out.println(pocet);
        int[] pole2 = {1, 2, 3, 4, 1, 6, 7, 9, 2};
        pocet = BubbleSort.sort2(pole2);
        System.out.println(pocet);
    }
}
