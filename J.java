import java.util.Scanner;

public class J {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String scelta;
        int pp;

        String pett;
        String midpersa;
        String ban;

        System.out.println("TU PADRE");

        System.out.println(
                "Benvenuto nel programma pett SUS, per verificare se PUG top ha perso inserire top, per vedere se devi compensare inserire compensare, per vedere se la mid ha perso inserire mid, per vedere se l'account di gianluxa è andato inserire ban");
        scelta = input.next();

        switch (scelta) {

            case "top": {
                System.out.println("Pug top ha perso?, si o no");
                pett = input.next();

                if (pett.equals("si")) {

                    System.out.println("Pug clash non giochi top vai giungla");

                } else if (pett.equals("no")) {

                    System.out.println("Pug al clash non giochi top lo stesso");

                }
            }
                break;

            case "compensare": {

                System.out.println("Inserisci grandezza PiPi");
                pp = input.nextInt();

                if (pp <= 3) {
                    System.out.println("Devi compensare per il pp small");
                }

                else {
                    System.out.println("Non compensi");
                }

            }
                break;
            case "mid": {
                System.out.println("La mid ha perso?,si o no");
                midpersa = input.next();

                if (midpersa.equals("si")) {

                    System.out.println("Tastiera di gianluca rotta UwU, forse anche il mouse però non si sa");
                } else if (midpersa.equals("no")) {

                    System.out.println("La partita continua");

                }

            }
                break;

            case "ban": {
                System.out.println("L'account di gianluxa è bannato?, si o no");
                ban = input.next();

                if (ban.equals("si")) {

                    System.out.println("Vabbe dai ceeeeeeeeeeeee ci disintossichiamo");

                } else if (ban.equals("no")) {

                    System.out.println("La scalata al lv 800 continua");

                }

            }
                break;

        }
    }
}
