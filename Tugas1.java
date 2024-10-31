import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput : " );
        int jumlahMhs = sc.nextInt();
        double rata2, total = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (1 + i) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }else if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        
        for (int i : nilaiMhs) {
            total += i;
            System.out.println("Nilai mahasiswa ke-" + (1 + i) + " : " + i );
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Nilai tertinggi mahasiswa adalah : " + nilaiTertinggi);
        System.out.println("Nilai terendah mahasiswa adalah : " + nilaiTerendah);
        System.out.println("Rata-rata nilai mahasiswa adalah " + rata2);
    }
}
