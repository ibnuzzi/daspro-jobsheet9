import java.util.Scanner;
public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : " );
        int jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2Lulus = 0;
        double rata2TidakLulus = 0;
        int mhsLulus = 0;
        int mhsTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                totalLulus += nilaiMhs[i];
                rata2Lulus = totalLulus / mhsLulus;
            }else{
                mhsTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
                rata2TidakLulus = totalTidakLulus / mhsTidakLulus;
            }
        }
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
