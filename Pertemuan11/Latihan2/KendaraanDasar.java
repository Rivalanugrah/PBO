// Menyatakan bahwa kelas ini berada di dalam package Pertemuan11.Latihan2
package Pertemuan11.Latihan2;

// Mendefinisikan kelas abstrak bernama KendaraanDasar
// Kelas ini mengimplementasikan interface Kendaraan
public abstract class KendaraanDasar implements Kendaraan {

    // Atribut protected agar bisa diakses oleh kelas turunan
    protected String merk;   // Menyimpan merek kendaraan (contoh: Toyota, Tesla)
    protected String model;  // Menyimpan model kendaraan (contoh: Avanza, Model S)

    // Konstruktor untuk menginisialisasi atribut merk dan model
    public KendaraanDasar(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    // Method getter untuk mengakses nilai merek
    public String getMerk() {
        return merk;
    }

    // Method getter untuk mengakses nilai model
    public String getModel() {
        return model;
    }

    // Method abstrak dari interface Kendaraan
    // Harus diimplementasikan oleh kelas turunan (seperti MobilBensin, MotorListrik, dll.)
    public abstract double hitungKonsumsi(double jarak);

    // Catatan: method getJenis() dari interface belum diimplementasikan di sini.
    // Maka, kelas turunan wajib mengimplementasikan getJenis().
}
