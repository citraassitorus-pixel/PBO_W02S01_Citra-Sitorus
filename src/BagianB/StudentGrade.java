/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/** 
 * NIM  : 41425042
 * Nama : Citra Sitorus
 * PRODI: D4 - TRPL
 */
public class StudentGrade {
    private String nim;
    private String nama;
    private double nilaikuis;
    private double nilaiUTS;
    private String gradeHuruf;
    
    public StudentGrade(String nim, String name) {
        this.nim = nim;
        this.nama = name;
        this.nilaikuis = 0.0;
        this.nilaiUTS = 0.0;
        updateGradeHuruf();
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getNilaikuis() {
        return nilaikuis;
    }
    
    public void setNilaiKuis(double nilaikuis) {
        if (nilaikuis >= 0.0 && nilaikuis <= 100.0) {
            this.nilaikuis = nilaikuis;
            updateGradeHuruf();
        } else {
            System.out.println("Nilai kuis harus berada di antara 0.0 sampai 100.0!");
        } 
    }
    
    public double getNilaiUTS() {
        return nilaiUTS;
    }
    
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <=100.0) {
            this.nilaiUTS = nilaiUTS;
            updateGradeHuruf();
        } else {
            System.out.println("Nilai UTS harus berada di antara 0.0 sampai 100.0!");
        }
    }
    
    public String getGradeHuruf() {
        return gradeHuruf;
    }
    
    public double hitungNilaiAkhir() {
        return (0.40 * nilaikuis) + (0.60 * nilaiUTS);
    }
    
    private void updateGradeHuruf() {
        
        double nilaiAkhir = hitungNilaiAkhir();
        
        if (nilaiAkhir >= 80) {
            gradeHuruf = "A";
        }else  if (nilaiAkhir >= 70) {
            gradeHuruf = "B";
        }else if (nilaiAkhir >= 60) {
            gradeHuruf = "C";
        }else if (nilaiAkhir >= 50) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }
    
    public void cetakLaporan() {
        System.out.println("LAPORAN HASIL STUDI");
        System.out.println("NIM       : " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Kuis: " + nilaikuis);
        System.out.println("Nilai UTS : " + nilaiUTS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        System.out.println("grade      :" + gradeHuruf);
    }
    
    public static void main(String[] args) {
        
        StudentGrade mahasiswa = new StudentGrade(
                "12s23001",
                "Citra"
        );
        
        mahasiswa.setNilaiKuis(80);
        mahasiswa.setNilaiUTS(90);
        
        mahasiswa.cetakLaporan();
        
        System.out.println();
        
        mahasiswa.setNilaiKuis(120);
        mahasiswa.setNilaiUTS(-10);
    }
}

