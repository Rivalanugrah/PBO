package Pertemuan11.Latihan2;

public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan mobil1 = new MobilBensin("Toyota", "Avanza", 12);
        Kendaraan mobil2 = new MobilListrik("Tesla", "Model 3", 6.5);

        double jarakTempuh = 100; // kilometer

        System.out.println(mobil1.getJenis() + " " + mobil1.hitungKonsumsi(jarakTempuh) + " liter");
        System.out.println(mobil2.getJenis() + " " + mobil2.hitungKonsumsi(jarakTempuh) + " kWh");
    }
}
