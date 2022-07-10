import java.util.Scanner;

public class J {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int scelta;
        int pett;
        int pp;
        int midpersa;

        System.out.println("TU PADRE");
        System.out.println(
                "Benvenuto nel programma pett SUS, per verificare se PUG top ha perso inserire 1, per vedere se devi compensare inserire 2, per vedere se la mid ha perso inserire 3");
        scelta = input.nextInt();
        switch (scelta) {

            case 1: {
                System.out.println("Pug top ha perso?, se si 1 se no 0");
                pett = input.nextInt();

                if (pett == 1) {

                    System.out.println("Pug clash non giochi top vai giungla");

                } else if (pett == 0) {

                    System.out.println("Pug al clash non giochi top lo stesso");

                }
            }
                break;

            case 2: {

                System.out.println("Inserisci grandezza PiPi");
                pp = input.nextInt();

                if (pp <= 3) {
                    System.out.println("Devi compensare per il pp small");
                }

                else {
                    System.out.println("non compensi neanche il cazzo");
                }

            }
                break;
            case 3: {
                System.out.println("La mid ha perso?, se si 1 se no 0");
                midpersa = input.nextInt();

                if (midpersa == 1) {

                    System.out.println("Tastiera di gianluca rotta UwU");
                } else if (midpersa == 0) {

                    System.out.println("La partita continua");

                }

            }
                break;

        }
    }
}
