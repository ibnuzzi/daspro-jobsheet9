import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pesanan : ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String []pesanan = new String[jumlahPesanan];
        int []hargaPesanan = new int[jumlahPesanan];
        int totalBiayaPesanan = 0;

        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan nama makanan/minuman : ");
            pesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga makanan/minuman : ");
            hargaPesanan[i] = sc.nextInt(); 
            sc.nextLine();
            totalBiayaPesanan += hargaPesanan[i];
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " : " + hargaPesanan[i]);
        }
        
        System.out.println("\nTotal Biaya Pesanan: " + totalBiayaPesanan);
    }
}
