package exercicios1009;

import java.util.Arrays;
import java.util.Random;

public class PraticaTarde {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Exercício 1");
        System.out.println("");

        String[] novosFuncionarios = new String[5];

        novosFuncionarios[0] = "Jonathan";
        novosFuncionarios[1] = "Alison";
        novosFuncionarios[2] = "Sergio";
        novosFuncionarios[3] = "Fábio";
        novosFuncionarios[4] = "Hendy";

        for (int i = 0; i < novosFuncionarios.length; i++) {
            System.out.println("Bem-vindo ao Mundo do TI, Coder " + novosFuncionarios[i] + ", numero: " + i);
        }

        System.out.println("");
        System.out.println("Exercício 2");
        System.out.println("");

        String[] projetos = new String[4];

        projetos[0] = "frontEnd";
        projetos[1] = "backEnd";
        projetos[2] = "bancoDeDados";
        projetos[3] = "QAOuTester";

        String aux = projetos[1];
        projetos[1] = projetos[3];
        projetos[3] = aux;

        for (int i = 0; i < projetos.length; i++) {
            System.out.println(projetos[i]);
        }

        System.out.println("");
        System.out.println("Exercício 3");
        System.out.println("");

        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("");
        System.out.println("Exercício 4");
        System.out.println("");

        Random generator = new Random();

        for (int i = 0; i < arr.length; i++) {
           int randomIndexToSwap = generator.nextInt(arr.length);
           int temp = arr[randomIndexToSwap];
           arr[randomIndexToSwap] = arr[i];
           arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
