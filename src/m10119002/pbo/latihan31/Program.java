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
 * Deskripsi Program : Program ini berisi program Perkenalan Mahasiswa
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    
    public static void main(String[] args) {
        Mahasiswa mhs_rizki = new Mahasiswa();
        mhs_rizki.nim = "10110269";
        mhs_rizki.nama = "Rizki Adam Kurniawan";
        
        Mahasiswa mhs_indra = new Mahasiswa();
        mhs_indra.nim = "10110270";
        mhs_indra.nama = "Indra Tiola";
        
        Mahasiswa mhs_robi = new Mahasiswa();
        mhs_robi.nim = "10110271";
        mhs_robi.nama = "Robi Tanzil Ganefi";
        
        Mahasiswa mhs_awaludin = new Mahasiswa();
        mhs_awaludin.nim = "10110269";
        mhs_awaludin.nama = "Muhammad Nur Awaludin";
        
        mhs_rizki.perkenalkanDiri();
        mhs_indra.perkenalkanDiri();
        mhs_robi.perkenalkanDiri();
        mhs_awaludin.perkenalkanDiri();
    }
    
}
