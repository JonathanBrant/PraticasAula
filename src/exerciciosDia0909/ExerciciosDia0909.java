package exerciciosDia0909;

public class ExerciciosDia0909 {
    public static void main(String[] args) {
        // Exercicio 1
        System.out.println("Exercício 01");
        System.out.println("");
        for(int i= 0; i <= 7; i++){
            if (i<= 1) {
            System.out.println("Estacionamento com " + i + " carro");
            } else if (i < 7) {
                System.out.println("Estacionamento com " + i +" carros");
            } else {
                System.out.println("Estacionamento lotado");
            }
        }
        // Exercicio 2
        System.out.println("");
        System.out.println("Exercício 02");
        System.out.println("");
        int produto = 0;
        while(produto <= 10){
        System.out.println(produto + " produtos vendidos");
        produto++;
        }

        // Exercicio 3
        System.out.println("");
        System.out.println("Exercício 03");
        System.out.println("");
        int dose = 0;
        do {
            if (dose <= 1) {
                System.out.println("O paciente tomou " + dose + " dose");
                dose++;
            } else if (dose <= 15) {
            System.out.println("O paciente tomou " + dose + " doses");
            dose++;
            }
        }while(dose <= 15);
    }
}

