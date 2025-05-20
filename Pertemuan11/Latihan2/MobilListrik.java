// Menyatakan bahwa file ini berada di dalam package Pertemuan11.Latihan2
package Pertemuan11.Latihan2;

// Kelas MobilListrik merupakan turunan dari kelas abstrak KendaraanDasar
public class MobilListrik extends KendaraanDasar {

    // Atribut khusus untuk mobil listrik: efisiensi dalam kilometer per kWh
    private double konsumsiPerKwh;

    // Konstruktor untuk menginisialisasi atribut mobil listrik
    public MobilListrik(String merk, String model, double konsumsiPerKwh) {
        // Memanggil konstruktor milik kelas abstrak (superclass)
        super(merk, model);
        this.konsumsiPerKwh = konsumsiPerKwh;
    }

    // Implementasi method abstrak dari KendaraanDasar
    @Override
    public double hitungKonsumsi(double jarak) {
        // Menghitung jumlah energi listrik (dalam kWh) yang dibutuhkan
        return jarak / konsumsiPerKwh;
    }

    // Implementasi method dari interface Kendaraan
    @Override
    public String getJenis() {
        return "Mobil Listrik"; // Mengembalikan jenis kendaraan
    }
}
