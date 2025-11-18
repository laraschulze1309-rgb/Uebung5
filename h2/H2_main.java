package h2;

public class H2_main {
    public static void main(String[] args) {
        int n = 1;
        int digits = 0; //Anzahl der Ziffern von n
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};

           int temp = n;

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
        }

        temp = n;
        for (int i = 8; i >= 9 - digits; i--) {
            a[i] = temp % 10;
            temp /= 10;
        }


        System.out.println("Zahl n: " + n);
        System.out.println("Anzahl der Ziffern: " + digits);
        System.out.print("Array a: ");


        for (int i = 0; i < 9; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();



    }
    
}
