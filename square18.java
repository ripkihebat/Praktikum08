import java.util.Scanner;

public class square18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = sc18.nextInt();
        
        for(int iOuter=1; iOuter<=N; iOuter++) {
            for(int i=1; i<=N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
