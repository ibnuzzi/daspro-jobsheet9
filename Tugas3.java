import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String key = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                System.out.println("Makanan yang anda cari ditemukan.");
                System.out.println("Makanan yang anda cari adalah: " + menu[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Makanan yang anda cari tidak ditemukan.");
        }
    }
}
