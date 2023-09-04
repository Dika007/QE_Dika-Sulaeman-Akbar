/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroductionBasicProgramming.SoalPrioritas1No1;

import java.util.Scanner;

/**
 * @author Dika Sulaeman Akbar
 */
public class LuasSegitiga {
    public static void main(String[] args) {

        double luas, alas, tinggi;

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan Panjang Alas: ");
        alas = scan.nextDouble();
        System.out.println("Masukan Tinggi: ");
        tinggi = scan.nextDouble();

        luas = 0.5 * alas * tinggi;

        System.out.println("luas segitiga adalah: " + luas);
    }
}
