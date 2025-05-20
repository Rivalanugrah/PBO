// Mendeklarasikan bahwa file ini berada dalam package bernama Pertemuan11.Latihan2
package Pertemuan11.Latihan2;

// Mendefinisikan interface bernama Kendaraan
// Interface ini menyatakan bahwa setiap kelas yang mengimplementasikannya
// harus memiliki dua metode: hitungKonsumsi dan getJenis
public interface Kendaraan {

    // Metode abstrak untuk menghitung konsumsi bahan bakar atau energi
    // Parameter: jarak (dalam satuan kilometer)
    // Return: konsumsi bahan bakar/energi (dalam liter/kWh, tergantung jenis kendaraan)
    double hitungKonsumsi(double jarak);

    // Metode abstrak untuk mengembalikan jenis kendaraan
    // Misalnya: "Mobil Bensin", "Motor Listrik", dll.
    String getJenis();
}
