package exerciciosDia0909;

import java.util.Scanner;

public class TarefaDois {
    public static void main(String[] args) {
        float E = 0;
        Scanner input = new Scanner(System.in);
        float fatorial = 1;

        System.out.print("Entre com o numero: ");

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            fatorial *= i;
            E = E + fatorial + 1;
        }
        System.out.println("Resultado de E: " + E);
    }
}