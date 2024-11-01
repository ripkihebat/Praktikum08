import java.util.Scanner;

public class star18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc18.nextInt();

        for(int i=1; i<N; i++) {
            System.out.print("*");
        }
    }
}