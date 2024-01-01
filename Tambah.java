public class Tambah extends Hitung implements Operasi {
    private double angka1;
    private double angka2;

    public Tambah() {
        this.angka1 = 0;
        this.angka2 = 0;
    }

    @Override
    public double hitung(double angka1, double angka2) {
        return angka1 + angka2;
    }
}
