package Pertemuan11.Latihan2;

public abstract class KendaraanDasar implements Kendaraan {
    protected String merk;
    protected String model;

    public KendaraanDasar(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public abstract double hitungKonsumsi(double jarak);
}

