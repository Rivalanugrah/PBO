package Pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private List<MataKuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(MataKuliah mk) {
        daftarMatakuliah.add(mk);
    }

    public List<MataKuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
        }
        return sb.toString();
    }
}
