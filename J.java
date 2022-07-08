import java.util.Scanner;

public class J {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pett;

        System.out.println("Pug top ha perso?, se si 1 se no 0");
        pett = input.nextInt();

        System.out.println("Inserisci grandezza PiPi");
        int pp;
        pp = input.nextInt();

        if (pp <= 3) {
            System.out.println("Devi compensare per il pp small");
        }

        else {
            System.out.println("non compensi neanche il cazzo");
        }

        if (pett == 1) {

            System.out.println("Pug clash non giochi top vai giungla");

        } else if (pett == 0) {

            System.out.println("Pug al clash non giochi top lo stesso");

        }
    }
}
