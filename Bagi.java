public class Bagi extends Hitung{
    public Bagi(double angka1, double angka2) {
        super(angka1, angka2);
    }

    @Override
    public double hitung(double angka1, double angka2) {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Pembagian oleh nol tidak diperbolehkan.");
            return 0;
        }
    }
}
