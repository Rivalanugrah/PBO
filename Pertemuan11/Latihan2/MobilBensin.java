// Menyatakan bahwa kelas ini berada dalam package Pertemuan11.Latihan2
package Pertemuan11.Latihan2;

// Kelas MobilBensin merupakan turunan dari kelas abstrak KendaraanDasar
public class MobilBensin extends KendaraanDasar {

    // Atribut tambahan khusus untuk mobil bensin
    private double konsumsiPerLiter; // Efisiensi bahan bakar (km per liter)

    // Konstruktor untuk inisialisasi atribut dari KendaraanDasar dan konsumsiPerLiter
    public MobilBensin(String merk, String model, double konsumsiPerLiter) {
        super(merk, model); // Memanggil konstruktor dari KendaraanDasar
        this.konsumsiPerLiter = konsumsiPerLiter;
    }

    // Implementasi method abstrak dari KendaraanDasar
    @Override
    public double hitungKonsumsi(double jarak) {
        // Menghitung jumlah liter bensin yang dibutuhkan berdasarkan jarak tempuh
        return jarak / konsumsiPerLiter;
    }

    // Implementasi method dari interface Kendaraan
    @Override
    public String getJenis() {
        return "Mobil Bensin"; // Mengembalikan jenis kendaraan
    }
}
