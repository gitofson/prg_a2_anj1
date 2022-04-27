package cz.spsmb.a2.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        int[] pole = new int[55];
        Random rnd = new Random();
        for (int i = 0; i < pole.length; i++) {
            pole[i] = rnd.nextInt(111);
        }
        int[] pole2;// = new int[pole.length];
        pole2 = Arrays.copyOf(pole, pole.length);
        int[] pole3;// = new int[pole.length];
        pole3 = Arrays.copyOf(pole, pole.length);

        System.out.println("prvni typ bubble sortu " + BubbleSort.sort1(pole) + "operaci");
        System.out.println("druhy typ bubble sortu " + BubbleSort.sort2(pole) + "operaci");
        QuickSort.quick(pole3,0,pole3.length-1);
        System.out.format("quick sort %d operaci%n", QuickSort.pocetIteraci);
    }
}
