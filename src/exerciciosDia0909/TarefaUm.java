package exerciciosDia0909;

import java.time.LocalDate;

public class TarefaUm {

    public static void main(String[] args) {
//        double salario = 1000;
//        double aumento = 0.015;
//        for( int i = 1995; i < 2021; i++) {
//            if (i == 1996) {
//                salario += (salario*aumento);
//                System.out.println(salario);
//            } else if ( i > 1996) {
//                salario += (salario*aumento*2);
//                System.out.println(salario);
//            }
//
//        }
//    }


//        double aumentoInicial = 0.015;
//        double salarioInicial = 1000;
//        double anoInicial = 1995;
//
//        do {
//            salarioInicial = salarioInicial + (salarioInicial * aumentoInicial);
//            aumentoInicial = aumentoInicial * 2;
//            anoInicial++;
//        } while (anoInicial < 2021);
//
//        System.out.println(salarioInicial);


        int anoInicial = 1995;
        LocalDate dataAtual = LocalDate.now();

        double salarioInicial = 1000;
        double aumentoInicial = 0.015;
        double salarioAtual = salarioInicial;
        double aumentoAtual = aumentoInicial;

        //Código refatorado com while

        int ano = anoInicial + 1;
//        while (ano <= dataAtual.getYear()) {
//            aumentoAtual = (ano == 1996) ? aumentoAtual : aumentoAtual*2;
//            salarioAtual += salarioAtual * (aumentoAtual);
//            ano++;
//        }
//
//        System.out.println(salarioAtual);

        //Código refatorado com do while

        do {
            aumentoAtual = (ano == 1996) ? aumentoAtual : aumentoAtual*2;
            salarioAtual += salarioAtual * (aumentoAtual);
            ano++;
        }while(ano <= dataAtual.getYear());

        System.out.println(salarioAtual);


        // Código original, mais extenso;

//        int ano = anoInicial + 1;
//        System.out.println("O seu salario no " + anoInicial + " é " + salarioAtual);
//        salarioAtual += salarioAtual * (aumentoAtual);
//        System.out.println("O seu salario no "+ ano + " é " + salarioAtual);
//        while (ano < dataAtual.getYear()){
//            ano++;
//            aumentoAtual = aumentoAtual * 2;
//            salarioAtual += salarioAtual * (aumentoAtual);
//            System.out.println("O seu salario no "+ ano + " é " + salarioAtual);
//        }




//        int ano = anoInicial + 1;
//
//        while(ano < dataAtual.getYear()) {
//            aumentoAtual = (ano == 1996)? aumentoAtual : aumentoAtual * 2;
//            salarioAtual += salarioAtual * (aumentoAtual);
//            ano++;
//        }
//        System.out.println("O salario atual do funcionário é: " + salarioAtual);
    }
}

