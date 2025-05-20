package Pertemuan11.Latihan2;

public class MobilListrik extends KendaraanDasar {
    private double konsumsiPerKwh;

    public MobilListrik(String merk, String model, double konsumsiPerKwh) {
        super(merk, model);
        this.konsumsiPerKwh = konsumsiPerKwh;
    }

    @Override
    public double hitungKonsumsi(double jarak) {
        return jarak / konsumsiPerKwh; // hasil dalam kWh
    }

    @Override
    public String getJenis() {
        return "Mobil Listrik";
    }
}
