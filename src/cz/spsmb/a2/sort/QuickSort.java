package cz.spsmb.a2.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static int pocetIteraci = 0;
    public static int partition (int a[], int start, int end)
    {
        int pivot = a[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            QuickSort.pocetIteraci++;
            // If current element is smaller than the pivot
            if (a[j] < pivot)
            {
                i++; // increment index of smaller element
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    /* function to implement quick sort */
    public static void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */
    {
        if (start < end)
        {
            int p = partition(a, start, end); //p is the partitioning index
           /* System.out.print("leva: ");
            for (int i = start; i <= p-1; i++) {
                System.out.print(a[i]+" ");
            }*/
            quick(a, start, p - 1);

            /*System.out.print("prava: ");
            for (int i = p+1; i <= end; i++) {
                System.out.print(a[i]+" ");
            }

            System.out.println();*/
            quick(a, p + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] pole = new int[60];
        Random rnd = new Random();
        for (int i = 0; i < pole.length; i++) {
            pole[i] = rnd.nextInt(111);
        }
        System.out.println("Before sorting array elements are - \n");
        System.out.println(Arrays.toString(pole));
        quick(pole, 0, pole.length - 1);
        System.out.println("\nAfter sorting array elements are - \n");
        System.out.println(Arrays.toString(pole));
        System.out.println("pocet iteraci: "+QuickSort.pocetIteraci);
    }
}
