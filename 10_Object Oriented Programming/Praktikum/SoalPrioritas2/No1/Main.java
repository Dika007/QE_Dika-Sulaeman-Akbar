/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOrientedProgramming.SoalPrioritas2.No1;

import java.util.Scanner;

/**
 *
 * @author Dika Sulaeman Akbar
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Add: ");
        double angka1 = input.nextDouble();
        double angka2 = input.nextDouble();
      
        System.out.print("substract: ");
        double angka3 = input.nextDouble();
        double angka4 = input.nextDouble();
        
        System.out.print("multiply: ");
        double angka5 = input.nextDouble();
        double angka6 = input.nextDouble();
        
        System.out.print("divide: ");
        double angka7 = input.nextDouble();
        double angka8 = input.nextDouble();

        Kalkulator calculator = new Kalkulator(angka1, angka2, angka3, angka4,  angka5, angka6,  angka7, angka8);

        System.out.println("Hasil Penjumlahan: " + calculator.penjumlahan());
        System.out.println("Hasil Pengurangan: " + calculator.pengurangan());
        System.out.println("Hasil Perkalian: " + calculator.perkalian());
        System.out.println("Hasil Pembagian: " + calculator.pembagian());
        
    }
}
