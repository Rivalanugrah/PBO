package Pertemuan11.Latihan2;

public class MobilBensin extends KendaraanDasar {
    private double konsumsiPerLiter;

    public MobilBensin(String merk, String model, double konsumsiPerLiter) {
        super(merk, model);
        this.konsumsiPerLiter = konsumsiPerLiter;
    }

    @Override
    public double hitungKonsumsi(double jarak) {
        return jarak / konsumsiPerLiter; // hasil dalam liter
    }

    @Override
    public String getJenis() {
        return "Mobil Bensin";
    }
}

