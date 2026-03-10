/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ServisKomputer;

/**
 *
 * @author Mohamad Ilmansyah
 */

import java.util.Scanner;

public class ServisKomputer{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nomorInput;
        int jumlahKomputer;
        double jumlahHarga = 0;

        int nomorAkun = 12345;
        String status = "valid";

        System.out.print("Masukkan nomor akun: ");
        nomorInput = input.nextInt();

        if (nomorInput == nomorAkun && status.equals("valid")) {

            System.out.print("Masukkan jumlah komputer yang diservis: ");
            jumlahKomputer = input.nextInt();

            if (jumlahKomputer == 1 || jumlahKomputer == 2) {
                jumlahHarga = 50;
            } 
            else if (jumlahKomputer >= 3 && jumlahKomputer <= 10) {
                jumlahHarga = 100;
            } 
            else if (jumlahKomputer > 10) {
                jumlahHarga = 500;
            }


            System.out.println("Invoice:");
            System.out.println("Nomor Akun: " + nomorInput);
            System.out.println("Jumlah Harga: $" + jumlahHarga);

        } else {

            System.out.println("Nomor akun tidak valid");

        }

        input.close();
    }
}
