/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroductionBasicProgramming.SoalPrioritas1No2;

import java.util.Scanner;

/**
 *
 * @author Dika Sulaeman Akbar
 */
public class Sampel1 {
     public static void main (String[] args) {
     
        int untung,hargabeli, hargajual;
       
        Scanner scan = new Scanner(System.in);
   
        System.out.println("Masukan harga beli: ");
        hargabeli = scan.nextInt();
        System.out.println("Masukan harga jual: ");
        hargajual = scan.nextInt();
  
        untung = hargajual - hargabeli;
 
        System.out.println("untung yang didapatkan adalah: " + untung);
    }
}
