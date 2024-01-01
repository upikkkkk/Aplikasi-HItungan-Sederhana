public class Bagi extends Hitung implements Operasi {
    private double angka1;
    private double angka2;

    public Bagi() {
        this.angka1 = 0;
        this.angka2 = 0;
    }

    @Override
    public double hitung(double angka1, double angka2) {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Pembagian tidak dapat dilakukan karena angka kedua adalah nol");
            return 0;
        }
    }
}
