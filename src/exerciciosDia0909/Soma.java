package exerciciosDia0909;

public class Soma {
    public static void main(String[] args) {

//        int z = 0;
        int i = 0;
        int par = 0;
        int impar = 0;

//        for (int y = 0; y < 20; y++) {
//            if(y % 2 ==0) {
//                par += y;
//            } else if (i % 2 != 0) {
//                impar += y;
//            }
//        }
//        if(z % 2 ==0) {
//            par += z;
//        } else if (i % 2 != 0) {
//            impar +=z;
//        }
//        do {
//
//        } while (z < 20);
//
        while (i < 20){
            if (i % 2 == 0){
                par += i;
            } else{
                impar += i;
            }
            i++;
        }

        System.out.println(par);
        System.out.println(impar);
    }


}
