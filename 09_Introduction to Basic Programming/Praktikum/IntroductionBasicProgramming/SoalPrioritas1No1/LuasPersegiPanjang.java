/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroductionBasicProgramming.SoalPrioritas1No1;

import java.util.Scanner;

/**
 *
 * @author Dika Sulaeman Akbar
 */
public class LuasPersegiPanjang {
     public static void main (String[] args) {
     
        int luas, panjang, lebar;
   
        Scanner scan = new Scanner(System.in);
   
        System.out.println("Masukan Panjang: ");
        panjang = scan.nextInt();
        System.out.println("Masukan Lebar: ");
        lebar = scan.nextInt();
 
    
        luas = panjang * lebar;
 
    
        System.out.println("luas persegi panjang adalah: " + luas);
    }
}
