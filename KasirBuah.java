import java.util.Scanner;

public class KasirBuah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar Buah:");
        System.out.println("1. Apel - Rp10.000 per kg");
        System.out.println("2. Jeruk - Rp12.000 per kg");
        System.out.println("3. Pisang - Rp8.000 per kg");

        System.out.print("Pilih buah (1-3): ");
        int pilihanBuah = scanner.nextInt();

        System.out.print("Masukkan jumlah (kg): ");
        int jumlah = scanner.nextInt();

        int harga = 0;

        switch (pilihanBuah) {
            case 1:
                harga = 10000;
                break;
            case 2:
                harga = 12000;
                break;
            case 3:
                harga = 8000;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        int totalHarga = jumlah * harga;
        if (totalHarga > 50000) {
            int diskon = totalHarga * 10 / 100;
            totalHarga -= diskon;
            System.out.println("Anda mendapatkan diskon 10%: Rp" + diskon);
        } else if (totalHarga > 25000) {
            System.out.println("Anda mendapatkan hadiah!");
        } else {
            System.out.println("Anda tidak dapat diskon atau hadiah.");
        }

        System.out.println("Total harga: Rp" + totalHarga);

        scanner.close();
    }
}
