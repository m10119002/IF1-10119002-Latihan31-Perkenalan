/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan31;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Mahasiswa
 * 
 * 
 */
public class Mahasiswa {
    public String nim, nama;
    
    public void perkenalkanDiri() {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name is ".concat(nama));
        System.out.println("");
    }
}
