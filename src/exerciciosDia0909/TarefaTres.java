package exerciciosDia0909;
import java.util.Scanner;

public class TarefaTres {
    public static void main(String[] args) {
        double fatorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            fatorial *= i;
            System.out.println(i + "!= " + fatorial);
        }
    }
}

//        System.out.println("O valor na posição " + N + " é " + arrayInt[N]);