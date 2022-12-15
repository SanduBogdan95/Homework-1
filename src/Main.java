import java.util.Scanner;

class myVariables {
    int numar = 1;
    String text = "Text";
    boolean b;
}

public class Main {
    public static void main(String[] args) {
        // Homework #1
        // 1.
        System.out.println("Exercitiul 1: ");
        System.out.println("Imi place Java");

        // 2.
        System.out.println("Exercitiul 2: ");
        for (int i = 0; i < 6; i++) {
            System.out.println("Cursul acesta este foarte fain!");
        }

        // 3.
        System.out.println("Exercitiul 3: ");
        int a = 24, d = a - 6;
        System.out.println("Varsta lui David este: " + d);

        // 4
        System.out.println("Exercitiul 4: ");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu o propozitie: ");
        String myString = keyboard.nextLine();

        // 5
        System.out.println("Exercitiul 5: ");
        myVariables nr = new myVariables();
        System.out.println(nr.numar);
        myVariables txt = new myVariables();
        System.out.println(txt.text);
        myVariables bb = new myVariables();
        System.out.println(bb.b);

        // 6
        System.out.println("Exercitiul 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int numar1 = scanner.nextInt();
        System.out.println("Introdu un numar: ");
        int numar2 = scanner.nextInt();
        System.out.println("Numerele introduse sunt: " + numar1 + " si " + numar2);

        // 7
        System.out.println("Exercitiul 7: ");
        double adunare = 5,
                scadere = 12.3,
                inmultire = -3.2,
                impartire = 4,
                modul = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        double nr1 = scanner.nextDouble();
        System.out.println("Adunare: " + (nr1 + adunare));
        System.out.println("Scadere: " + (nr1 - scadere));
        System.out.println("Inmultire: " + (nr1 * inmultire));
        System.out.println("Impartire: " + (nr1 / impartire));
        System.out.println("Modul: " + (nr1 % modul));
    }
}

// 8
class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }

}