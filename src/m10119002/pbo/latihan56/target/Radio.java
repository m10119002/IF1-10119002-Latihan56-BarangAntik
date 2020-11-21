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
 * Deskripsi Program : Class untuk objek Radio
 * Pertemuan 5
 * 
 */
public class Radio extends BarangAntik {
    private String name;
    
    public Radio(int umur) {super(umur);}
    
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
}
