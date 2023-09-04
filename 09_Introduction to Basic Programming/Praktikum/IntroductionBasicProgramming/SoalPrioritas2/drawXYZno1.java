/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroductionBasicProgramming.SoalPrioritas2;

import java.util.Scanner;

/**
 *
 * @author Dika Sulaeman Akbar
 */
public class drawXYZno1 {
 
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi: ");
        int jumlahtinggi = scanner.nextInt();
        System.out.print("Masukkan baris: ");
        int jumlahBaris = scanner.nextInt();

        for (int i = 1; i <= jumlahtinggi; i++) {
            for (int j = 1; j <= jumlahBaris; j++) {
                int nomorUrut = (i - 1) * jumlahBaris + j;
                if (nomorUrut % 3 == 0) {
                    System.out.print("X");
                } else if (nomorUrut % 2 == 1) {
                    System.out.print("Y");
                } else {
                    System.out.print("Z");
                }
            }
            System.out.println(); 
        }
    }
}

        

