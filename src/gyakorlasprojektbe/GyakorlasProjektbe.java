package gyakorlasprojektbe;

import java.util.Random;
import java.util.Scanner;

public class GyakorlasProjektbe {

    public static void main(String[] args) {
        program();
    }

    private static void program() {
        int[] lista = tomb(5);
        kiiras(lista);
        boolean van = vanBenne13(lista);
        if (van) {
            System.out.println("van benne 13 ");
        } else {
            System.out.println("Nincs benne");
        }
        int index = bekeres(lista);
        int szam = lista[index];
        oszto(lista[index]);

    }

    private static int[] tomb(int db) {
        int[] tomb = new int[db];
        Random rnd = new Random();
        for (int i = 0; i < db; i++) {
            int szam = rnd.nextInt(-15, 16);
            tomb[i] = szam;
        }
        return tomb;
    }

    private static void kiiras(int[] lista) {
        int i = 0;
        while (i < lista.length - 1) {
            System.out.print(lista[i] + ",");
            i++;
        }
        System.out.println(lista[i]);
    }

    private static int bekeres(int[] lista) {
        int i = -1;
        Scanner sc = new Scanner(System.in);
        while (i < 0 || i > lista.length) {
            System.out.print("Kérek egy számot a lista mérete szerint");
            i = sc.nextInt();
            System.out.println("");
        }
        return i;

    }

    private static void oszto(int[] lista, int index) {
        int szam = lista[index];
        oszto(szam);
    }

    private static void oszto(int szam) {
        int oszto = 2;
        boolean oszt = false;
        int [] osztok = {};
        while (szam % oszto == 0 && szam > 1) {
            System.out.print(oszto);
            oszt = true;
            oszto++;
        }
        if (oszt) {
            System.out.print("nem prim ");
        } if (szam < 0) {
            System.out.println("negativ szam");
        } if (!oszt){
            System.out.println("Prim szám");
        }
    }

    private static boolean vanBenne13(int[] lista) {
        boolean van = false;
        int index = 0;
        while (index < lista.length && !(lista[index] == 13)) {

            index++;
        }
        return index < lista.length || index > lista.length;
    }

}
