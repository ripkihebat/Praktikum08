import java.util.Scanner;

public class RataNilai18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        
        int mahasiswa = 5;
        int nilai;
        double totalNilai, rataNilai;
        int i = 1;
        
        while(i <= mahasiswa) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i);
            totalNilai = 0;
            for(int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + ": ");
                nilai = sc18.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " adalah " + rataNilai);
            System.out.println();
            i++;
        }
    }
}
