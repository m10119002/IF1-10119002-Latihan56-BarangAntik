/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan56;

import m10119002.pbo.latihan56.target.Radio;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program umur barang antik
 * Pertemuan 5
 * 
 */
public class Program {
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        
        System.out.println("Nama barang Antik : ".concat(radio.getName()));
        radio.tampilUmur();
    }
}
