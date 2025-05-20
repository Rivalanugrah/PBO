// Menyatakan bahwa file ini berada di dalam package Pertemuan11.Latihan2
package Pertemuan11.Latihan2;

// Kelas utama (main class) untuk menjalankan program
public class KendaraanMain {
    public static void main(String[] args) {

        // Membuat objek MobilBensin menggunakan referensi tipe interface Kendaraan
        // Parameter: merk = "Toyota", model = "Avanza", konsumsi = 12 km/liter
        Kendaraan mobil1 = new MobilBensin("Toyota", "Avanza", 12);

        // Membuat objek MobilListrik menggunakan referensi tipe interface Kendaraan
        // Parameter: merk = "Tesla", model = "Model 3", konsumsi = 6.5 km/kWh
        Kendaraan mobil2 = new MobilListrik("Tesla", "Model 3", 6.5);

        // Menentukan jarak tempuh kendaraan
        double jarakTempuh = 100; // kilometer

        // Menampilkan hasil konsumsi bahan bakar untuk mobil bensin
        System.out.println(mobil1.getJenis() + " " + mobil1.hitungKonsumsi(jarakTempuh) + " liter");

        // Menampilkan hasil konsumsi energi untuk mobil listrik
        System.out.println(mobil2.getJenis() + " " + mobil2.hitungKonsumsi(jarakTempuh) + " kWh");
    }
}
