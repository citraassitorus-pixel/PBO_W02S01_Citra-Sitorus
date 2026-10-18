/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurrency_wait_notify;

/**
 * Nama: Citra Sitorus
 * NIM : 41425042
 * PRODI: D4 - TRPL
 */
public class MainConcurrency {
    public static void main(String[] args) {
        // Satu objek antrean dipakai bersama oleh dua thread
        AntreanShared antrean = new AntreanShared();

        // Thread Produsen: mengirim 3 pesan
        Thread produsen = new Thread(() -> {
            String[] listPesan = {"Halo", "Belajar Java", "Selesai"};
            for (String p : listPesan) {
                antrean.kirimPesan(p);
            }
        });

        // Thread Konsumen: mengambil 3 pesan
        Thread konsumen = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                antrean.ambilPesan();
            }
        });

        // Menjalankan kedua thread
        produsen.start();
        konsumen.start();
    }
}