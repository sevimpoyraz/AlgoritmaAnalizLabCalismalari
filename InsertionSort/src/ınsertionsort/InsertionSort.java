/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınsertionsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BM
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = 0;
        int temp;

        int diziElemanSayisi, swapSayisi = 0, comSayisi = 0, karsilastir = 0;
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Diziniz kaç elemanlı olsun?");
        diziElemanSayisi = in.nextInt();

        int dizi[] = new int[diziElemanSayisi];
        System.out.println("Diziniz:");

        for (int i = 0; i < diziElemanSayisi; i++) {
            dizi[i] = rnd.nextInt(10001);

            System.out.print(dizi[i] + "-");
        }
        int i, j, newValue;

        for (i = 1; i < dizi.length; i++) {

            j = i;

      // compare i with sorted elements and insert it
            // sorted elements: [0..i-1]
            while (j > 0 && dizi[j] < dizi[j - 1]) {

                temp = dizi[j];
                dizi[j] = dizi[j - 1];
                dizi[j - 1] = temp;

                swapSayisi++;
                comSayisi++;  // loop condition true

                j--;
            }
            comSayisi++; // checking loop condition when false
        }

        System.out.println("\n Comparison Count: " + comSayisi
                + "\n Swap Count: " + swapSayisi);
    }
}
