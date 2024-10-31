import java.util.Scanner;
public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput : " );
        int jumlahMhs = sc.nextInt();
        int hasil = 0;

        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (1 + i) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }        
        System.out.print("Masukkan Nilai yang ingin dicari : ");
        int key = sc.nextInt();

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                hasil = i + 1;
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
                break;
            }else{
                System.out.println("Nilai yang dicari tidak ditemukan");
                break;
            }
        }
    }
}
