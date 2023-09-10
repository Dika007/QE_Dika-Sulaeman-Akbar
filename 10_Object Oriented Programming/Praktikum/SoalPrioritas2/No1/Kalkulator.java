/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOrientedProgramming.SoalPrioritas2.No1;

/**
 *
 * @author Dika Sulaeman Akbar
 */
public class Kalkulator {
    private double angka1;
    private double angka2;
    
    private double angka3;
    private double angka4;
    
    private double angka5;
    private double angka6;
    
    private double angka7;
    private double angka8;
    
    public Kalkulator(double angka1, double angka2, double angka3, double angka4, double angka5, double angka6, double angka7, double angka8) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        
        this.angka3 = angka3;
        this.angka4 = angka4;
        
        this.angka5 = angka5;
        this.angka6 = angka6;
        
        this.angka7 = angka7;
        this.angka8 = angka8;
    }

    public double penjumlahan() {
        return angka1 + angka2;
    }

    public double pengurangan() {
        return angka3 - angka4;
    }

    public double perkalian() {
        return angka5 * angka6;
    }

    public double pembagian() {
        if (angka8 == 0) {
            System.out.println("Pembagian oleh nol tidak diperbolehkan.");
            return Double.NaN; // NaN (Not-a-Number) untuk menunjukkan hasil yang tidak valid
        } else {
            return angka7 / angka8;
        }
    }
}
