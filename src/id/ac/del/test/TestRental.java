/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/** 
 * NIM  : 41425042
 * Nama : Citra Sitorus
 * PRODI: D4 - TRPL
 */
public class TestRental {
   public static void main(String[] args) {
       VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);
       
        // Baris A
        v.plateNumber = "";
        
        // Baris B
        v.rentalRatePerDay = -500000;
        
        // Baris C
        v.discountRate = 0.20;
        
        // Baris D
        v.setRentalDays(-7);
        
        System.out.println("Total Biaya: Rp" + v.getTotalCost());
        }
} 

//1. Analisis Kompilasi dan Hak Akses (Access Modifiers)
//      i) Saat TestRental.java dikompilasi, baris manakah di antara Baris A, B, C, dan D
//         yang akan memicu compile-time error karena perbedaan package? Jelaskan atura 
//         cakupan akses (public, protected, default, dan private) yang menyebabkannya.
//         Jawaban : Karena VehicleRental dan TestRental berada di package yang berbeda, maka:
//                   Baris A → tidak error, karena plateNumber memiliki akses public.
//                   Baris B → error, karena rentalRatePerDay memiliki akses protected.
//                   Baris C → error, karena discountRate memiliki akses default (tidak ditulis public, protected, atau private).
//                   Baris D → tidak error, karena setRentalDays() memiliki akses public.
//         Jadi, yang menyebabkan compile-time error adalah Baris B dan Baris C.

// 2.  Kelemahan Integritas Data (Data Hiding & Validation)
//      i) Perhatikan Baris A dan Baris D. Walaupun Baris D memanggil metode setter, 
//         apa cacat logika yang masih terjadi pada method setRentalDays?
//         Jawaban : Cacat pada setRentalDays()Method pada modul adalah:
//                   public void setRentalDays(int days) {
//                   this.rentalDays = days;
//                   }
//         Masalahnya adalah tidak ada validasi Walaupun Baris D menggunakan setter:
//                   v.setRentalDays(-7);
//         nilai -7 tetap diterima dan disimpan ke rentalDays. Seharusnya jumlah hari sewa tidak boleh negatif.
//         Contohnya bisa diperbaiki menjadi:
//                   public void setRentalDays(int days) {
//                   if (days > 0) {
//                   this.rentalDays = days;
//                   } else {
//                   System.out.println("Jumlah hari sewa harus lebih dari 0.");
//                   }
//                   }
//         Dengan begitu, nilai negatif akan ditolak.

//      ii)Mengapa total biaya bisa negatif?
//         Jawaban  : Pada kode awal, rentalRatePerDay dan rentalDays masih bisa menerima nilai negatif.
//                    Contohnya: v.rentalRatePerDay = -500000;
//                    Karena tidak ada validasi, nilai tersebut digunakan dalam perhitungan:
//                    Akibatnya, hasil perhitungan dapat menjadi tidak masuk akal, termasuk total biaya negatif.
//                    Cara memperbaikinya
//                      Data yang penting seperti:
//                      plateNumber
//                      rentalRatePerDay
//                      rentalDays
//                      discountRate
//                    sebaiknya dibuat private, kemudian diakses melalui method yang memiliki validasi.
//                    Dengan cara ini, data keuangan tidak bisa sembarangan diubah dari luar class.
//                    Kesimpulan: prinsip data hiding dan validation digunakan supaya data dalam VehicleRental 
//                                tetap valid dan tidak terjadi data corruption.
//
// 3.  Penerapan Interface (Dependency Injection)
//     Jika Sistem ini akan dikembangkan untuk mendukung berbagai skema diskon (misalnya
//     MemberDiscount, FlashSaleDiscount, dan CorporateDiscount):
//      i) Rancanglah kontrak interface Discountable yang memiliki metode calculateDiscount(double amount).
//         Jawaban : Membuat interface Discountable
//                   Interface sesuai permintaan soal dapat dibuat seperti ini:
//                      public interface Discountable {
//                      double calculateDiscount(double amount);
//                      }

//                 Interface tersebut menjadi kontrak untuk berbagai jenis diskon.
//                  Misalnya nanti ada:
//                  1. MemberDiscount
//                  2. FlashSaleDiscount
//                  3. CorporateDiscount
//        Ketiganya bisa mengimplementasikan Discountable.

//      ii) Mengubah getTotalCost() 
//          Jawaban : Method getTotalCost() pada VehicleRental dapat diubah menjadi:
//                    public double getTotalCost(Discountable discount) {
//                      double total = rentalRatePerDay * rentalDays;
//                      double potongan = discount.calculateDiscount(total);
//                      return total - potongan;
//                  }
//                  Penjelasannya:
//                    1. Hitung harga sewa terlebih dahulu.
//                    2. Kirim harga tersebut ke calculateDiscount().
//                    3. Object diskon menentukan berapa besar potongannya.
//                    4. Potongan dikurangi dari total harga.
//                  Jadi method VehicleRental tidak perlu tahu apakah diskonnya Member, Flash Sale, atau Corporate.
//                  Interface Discountable digunakan sebagai kontrak untuk berbagai jenis diskon dengan method 
//                  calculateDiscount(double amount). Method getTotalCost() pada VehicleRental menerima parameter bertipe 
//                  Discountable, sehingga perhitungan diskon dapat dilakukan berdasarkan objek diskon yang diberikan saat runtime. 
//                  Dengan cara ini, VehicleRental tidak bergantung langsung pada satu jenis diskon dan dapat menggunakan
//                  berbagai implementasi diskon melalui polimorfisme.
//
