/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan56.target;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Barang Antik
 * Pertemuan 5
 * 
 */
public class BarangAntik {
    private int umur;
    
    public BarangAntik(int umur) {this.umur = umur;}
    
    public void tampilUmur() 
    {System.out.println("Umur barang antik ini adalah : ".
            concat(Integer.toString(this.umur)).concat(" tahun."));}
}
