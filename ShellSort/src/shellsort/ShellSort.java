/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shellsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BM
 */
public class ShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min=0; int temp;
      
      int diziElemanSayisi, swapSayisi=0, comSayisi=0;
    Scanner in = new Scanner(System.in);
    Random rnd = new Random();
    
      System.out.println("Diziniz kaç elemanlı olsun?");
    diziElemanSayisi = in.nextInt();
 
    int dizi[] = new int[diziElemanSayisi];
      System.out.println("Diziniz:");
 
       
  for (int i = 0; i <diziElemanSayisi; i++) {
            dizi[i] = rnd.nextInt(10001);
           
            System.out.print(dizi[i] + "-");
        }
        int increment = dizi.length / 2;
	while (increment > 0) {
		for (int i = increment; i < dizi.length; i++) {
                        comSayisi=comSayisi+1;
			int j = i;
			temp = dizi[i];
			while (j >= increment && dizi[j - increment] > temp) {
				dizi[j] = dizi[j - increment];
				j = j - increment;
                                swapSayisi=swapSayisi+1;
			}
			dizi[j] = temp;
		}
		if (increment == 2) {
			increment = 1;
		} else {
			increment *= (5.0 / 11);
		}
	}
         System.out.println("\nSıralı diziniz:");
        for (int j=0;j<=diziElemanSayisi-1;j++)
        System.out.println(dizi[j]+" ");
        System.out.println("swap sayiniz:" +swapSayisi);
        System.out.println("com sayiniz:" +comSayisi);
}
    }
    

