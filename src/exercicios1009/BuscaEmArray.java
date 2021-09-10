package exercicios1009;
import java.util.Scanner;


public class BuscaEmArray {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Digite a posição do array desejada: ");
//        int N = input.nextInt();

//        int[] arrayInt = new int[10];
//        arrayInt[0] = 1;
//        arrayInt[1] = 2;
//        arrayInt[2] = 3;
//        arrayInt[3] = 4;
//        arrayInt[4] = 5;
//        arrayInt[5] = 6;
//        arrayInt[6] = 7;
//        arrayInt[7] = 8;
//        arrayInt[8] = 9;
//        arrayInt[9] = 10;
//
//        System.out.println("O valor na posição " + N + " é: " + arrayInt[N]);
//
//        for (int i = 0; i < N ; i++){
//        System.out.println(arrayInt[i]);
//        }

        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int elemento = 6;
            int posicao;

//            for (int i = 0; i < numeros.length; i++) {
//                if(numeros[i] == elemento) {
//                    posicao = i;
//                    break;
//                }
//            }
        posicao = buscarPosicaoElemento(numeros, elemento);

            if (posicao == -1) {

                System.out.println("O elemento " + elemento + " não foi localizado");
            } else {
                System.out.println("O elemento " + elemento + " está na posição " + posicao);
            }


        }
        public static int buscarPosicaoElemento(int[] numeros, int elemento) {
            for( int i = 0; i < numeros.length; i++) {
                if (numeros[i] == elemento) {
                    return i;
                }
            }
        return -1;
        }

    }

