package exerciciosDia0909;
import java.util.Scanner;

public class Tabuadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int N = input.nextInt();
        for (int i = 1; i <= N; i++){
            if(i%2==0) System.out.println("Tabuada do " + i);
            for(int j = 0; j <= 10; j++) {
            if (i%2 == 0) {
                int produto = i * j;
//                System.out.println("Tabuada do " + i);
                System.out.println(i + " X " + j + " = " + produto);
            }
            }
        }
    }
}
