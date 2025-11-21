package h3;

public class H3_main {
    public static void main(String[] args) {
       
        int[][] einheiten = { {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
                             {     0,     0,     0,    0,    0,    0,   0,   0,   0,  0,  0,  0, 0, 0, 0} };

        int input = 10250;

     for (int i = 0; i < 15; i++) {
            int wert = einheiten[0][i];   // Wert der Einheit z.B. 5000
            int anzahl = input / wert;    // Wie oft passt das rein?
            einheiten[1][i] = anzahl;     // In Array eintragen
            input = input % wert;         // Restbetrag berechnen
        }

        System.out.println("Einheiten:");
        for (int i : einheiten[0]) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Anzahl Einheiten:");
        for (int i : einheiten[1]) {
            System.out.print("[" + i + "]"  + " ");
        }
    }

}

