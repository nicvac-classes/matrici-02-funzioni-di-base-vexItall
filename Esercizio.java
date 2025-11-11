//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {

    public static Scanner in = new Scanner( System.in );

    public static void assegnaMatrice(int[][] M, int nR, int nC, int v) {
        for(int i = 0; i < nR; ++i){
            for(int j = 0; j < nC; ++j){
                M[i][j] = v;
            }
        }
    }

    public static void azzeraMatrice(int[][] M, int nR, int nC) {
        assegnaMatrice(M, nR, nC, 0);
    }

    public static void riempiCasuale(int[][] M, int nR, int nC, int min, int max) {
        Random rand = new Random();
        for(int i = 0; i < nR; ++i){
            for(int j = 0; j < nC; ++j){
                M[i][j] = rand.nextInt(max + 1 - min) + min;
            }
        }
    }

    public static void main(String args[]) {

        System.out.println("---------------------------------------Esercizio1---------------------------------------");

        int[][] M = new int[3][5];
        int nR = 3; 
        int nC = 5;

        int num;

        System.out.print("Inserire valore da inserire nella matrice: ");
        num = Integer.parseInt(in.nextLine());

        assegnaMatrice(M, nR, nC, num);
        UtilsMatrice.visualizza(M);

        System.out.println("---------------------------------------Esercizio2---------------------------------------");

        int[][] M2 = new int[3][5];
        int nR2 = 3; 
        int nC2 = 5;

        azzeraMatrice(M2, nR2, nC2);
        UtilsMatrice.visualizza(M2);

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md