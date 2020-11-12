package com.minr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : program penilaian mahasiswa
 *
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa nilai = new Mahasiswa(75, 45, 34);
        double nilaiAkhir = nilai.getNilaiAkhir();
        char index = nilai.getIndex(nilaiAkhir);
        System.out.println("QUIZ        = " + nilai.getQUIZ());
        System.out.println("UTS         = " + nilai.getUTS());
        System.out.println("UAS         = " + nilai.getUAS());
        System.out.println("\nNIlai Akhir = " + nilaiAkhir);
        System.out.println("\nIndex = " + index);
        System.out.println("Keterangan = " + nilai.getKeterangan(index));
    }
}
