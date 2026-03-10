/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany. ServisKomputer1;

/**
 *
 * @author Mohamad Ilmansyah
 */
import java.util.Scanner;

public class  ServisKomputer1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahKomputer;
        int peripheral;
        double hargaAwal = 0;
        double hargaTambahan = 0;
        double totalHarga;
        boolean luarJamKerja;
        boolean dropOffPickup;

        System.out.print("Masukkan jumlah komputer: ");
        jumlahKomputer = input.nextInt();

        System.out.print("Masukkan jumlah peripheral: ");
        peripheral = input.nextInt();

        if (jumlahKomputer == 1 || jumlahKomputer == 2) {
            hargaAwal = 50;
            hargaTambahan = 0;
        } 
        else if (jumlahKomputer >= 3 && jumlahKomputer <= 10) {
            hargaAwal = 100;
            hargaTambahan = 10 * peripheral;
        } 
        else if (jumlahKomputer > 10) {
            hargaAwal = 500;
            hargaTambahan = 10 * peripheral;
        }

        System.out.print("Apakah servis di luar jam kerja? (true/false): ");
        luarJamKerja = input.nextBoolean();

        if (luarJamKerja) {
            hargaAwal = hargaAwal * 2;
        }

        totalHarga = hargaAwal + hargaTambahan;

        System.out.print("Apakah customer drop off dan pick up sendiri? (true/false): ");
        dropOffPickup = input.nextBoolean();

        if (dropOffPickup) {
            totalHarga = totalHarga / 2;
        }

        System.out.println("Total biaya servis = $" + totalHarga);
    }
}
       
