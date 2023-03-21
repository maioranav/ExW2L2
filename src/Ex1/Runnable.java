package Ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Runnable {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Set<String> array = new HashSet<String>();
        ArrayList<String> duplicati = new ArrayList<>();
        System.out.println("Inserisci la dimensione dell'array");
        int dim = scan.nextInt();
        scan.nextLine();
        if (dim < 1) {
            throw new Exception("Valore negativo");
        } else {
            for (int i = 0; i < dim; i++) {
                System.out.println("Inserisci il valore dell'elemento n." + i);
                String val = scan.nextLine();
                boolean aggiungi = array.add(val);
                if (!aggiungi) {
                    duplicati.add(val);
                }
            }
            System.out.println("\n *** ELENCO DUPLICATI *** ");
            System.out.println(duplicati.toString());
            System.out.println("\n *** ELENCO SALVATI (quantità " + array.size() + ") *** ");
            System.out.println(array.toString());
        }
    }

}
