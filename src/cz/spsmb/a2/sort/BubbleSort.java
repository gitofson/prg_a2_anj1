package cz.spsmb.a2.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static int sort1(int[] pole) {
        int pocet = 0;
        boolean proh = true;
        int i = 0;
        while (proh) {
            proh = false;
            for (int j = 0; j < pole.length - i - 1; j++) {
                pocet++;
                if (pole[j + 1] < pole[j]) {

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
            //for (int j = 0; j < pole.length - 1 ; j++) { //neoptimalizovan√° varianta
            for (int j = 0; j < pole.length - 1 - i; j++) { //optimalizovan√° varianta
                pocet++;
                if(pole[j] > pole[j+1]) {

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
        int[] pole = new int[55];
        Random rnd = new Random();
        for (int i = 0; i < pole.length; i++) {
            pole[i] = rnd.nextInt(111);
        }
        int[] pole2;// = new int[pole.length];
        pole2 = Arrays.copyOf(pole, pole.length);
        int pocet = BubbleSort.sort1(pole);
        System.out.println(pocet);
        pocet = BubbleSort.sort2(pole2);
        System.out.println(pocet);
    }
}
