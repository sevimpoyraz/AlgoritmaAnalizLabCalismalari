package uygulama2;
import java.util.Scanner;
import java.util.Random;
 
class Uygulama2 {
  public static void main(String []args) {
    int diziElemanSayisi, c, d, swap;
    int swapSay=0;
    int num_comps=0;
    Scanner in = new Scanner(System.in);
    Random rnd = new Random();
 
    System.out.println("Diziniz kaç elemanlı olsun?");
    diziElemanSayisi = in.nextInt();
 
    int dizi[] = new int[diziElemanSayisi];
      System.out.println("Dizininiz:");
 
  for (int i = 0; i <diziElemanSayisi; i++) {
            dizi[i] = rnd.nextInt(1001);
           
            System.out.print(dizi[i] + "-");
        }
 
    for (c = 0; c < ( diziElemanSayisi - 1 ); c++) {
      for (d = 0; d < diziElemanSayisi - c - 1; d++) {
          num_comps = num_comps + 1;
        if (dizi[d] > dizi[d+1]) /* For descending order use < */
        {
          swap       = dizi[d];
          dizi[d]   = dizi[d+1];
          dizi[d+1] = swap;
          swapSay=swapSay+1;
        }
      }
    }
      System.out.println("\nSwap Sayisi: "+swapSay);
      System.out.println("\nComparison Sayisi: "+num_comps);
      System.out.println("\nSıralı diziniz:");
     
 
    for (c = 0; c < diziElemanSayisi; c++) 
      System.out.println(dizi[c]);
  }
  
}