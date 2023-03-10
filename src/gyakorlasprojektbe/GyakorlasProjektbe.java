
package gyakorlasprojektbe;
import java.util.Random;

public class GyakorlasProjektbe {

    
    public static void main(String[] args) {
        program();
    }

    private static void program() {
        int [] lista = tomb(5);
        kiiras(lista);
        
    }
    private static int[] tomb(int db) {
        int [] tomb = new int [db];
        Random rnd = new Random();
        for (int i = 0; i < db; i++) {
            int szam = rnd.nextInt(-15,16);
            tomb[i] = szam;
        }
        return tomb;    
    }

    private static void kiiras(int[] lista) {
       int i = 0;
       while (i<lista.length-1) {
            System.out.print(lista[i] + ",");
           i++;
       }
        System.out.println("");
    }
    
}
