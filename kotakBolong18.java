import java.util.Scanner;

public class kotakBolong18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc18.nextInt();
        
        if(N < 3) {
            System.out.println("N minimal harus 3");
            return;
        }
        
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if(i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}
