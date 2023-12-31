import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INPUTAN");
        System.out.println("-------------------------------");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scan.nextDouble();
        System.out.print("Masukkan angka kedua  : ");
        double angka2 = scan.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("MENU");
        System.out.println("-------------------------------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("-------------------------------");
        System.out.println("Masukkan pilihan : ");
        int pil = scan.nextInt();

        switch(pil){
            case 1:
                Hitung tambah = new Tambah(angka1, angka2);
                double hasilPenjumlahan = tambah.hitung(angka1, angka2);
                System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
                break;

            case 2:
                Hitung kurang = new Kurang(angka1, angka2);
                double hasilPengurangan = kurang.hitung(angka1, angka2);
                System.out.println("Hasil pengurangan: " + hasilPengurangan);
                break;

            case 3:
                Hitung kali = new Kali(angka1, angka2);
                double hasilPerkalian = kali.hitung(angka1, angka2);
                System.out.println("Hasil perkalian: " + hasilPerkalian);
                break;

            case 4:
                Hitung bagi = new Bagi(angka1, angka2);
                double hasilPembagian = bagi.hitung(angka1, angka2);
                System.out.println("Hasil pembagian: " + hasilPembagian);
                break;
        }
    }
}