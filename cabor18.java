import java.util.Scanner;

public class cabor18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        
        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};
        
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc18.nextInt();
        sc18.nextLine();
        
        for(String olahraga : cabor) {
            System.out.println("\nCabang Olahraga " + olahraga);
            for(int i = 1; i <= jumlahPoliteknik; i++) {
                System.out.println("\nPoliteknik ke-" + i);
                for(int j = 1; j <= 5; j++) {
                    System.out.print("Masukkan nama atlet ke-" + j + ": ");
                    String namaAtlet = sc18.nextLine();
                }
            }
        }
        
        System.out.println("\nDaftar Atlet Porseni 2024:");
    
    }
}
