package h1;

public class H1_main {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < myArray.length / 2; i++) { // Nur bis zur Mitte des Arrays 
            int temp = myArray[i];   // Wert zwischenspeichern
            myArray[i] = myArray[myArray.length - 1 - i]; // Wert von der anderen Seite zuweisen
            myArray[myArray.length - 1 - i] = temp;
        }


        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}

