import Multimedia.Multimedia;
import Multimedia.PlayerAudio;
import Multimedia.PlayerVideo;
import Multimedia.MyImage;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Inserisci titolo audio:");
        PlayerAudio audio = new PlayerAudio(scn.nextLine(), 5, 3);
        System.out.println("Inserisci titolo video:");
        PlayerVideo video = new PlayerVideo(scn.nextLine(), 5,5,3);
        System.out.println("Inserisci titolo Immagine:");
        MyImage immagine = new MyImage(scn.nextLine(), 3);
        System.out.println("Inserisci titolo Immagine:");
        MyImage immagine2 = new MyImage(scn.nextLine(), 6);
        System.out.println("Inserisci titolo audio:");
        PlayerAudio audio2 = new PlayerAudio(scn.nextLine(), 8, 6);

        Multimedia[] mlt = {audio, video, immagine, immagine2, audio2};
        int scelta = 0;
        do {
            System.out.println("Cosa vuoi riprodurre? 0 per uscire");
            for (int i = 0; i < mlt.length; i++) {
                System.out.println(i+1 + ") " + mlt[i].getTitolo());

            }
            scelta = Integer.parseInt(scn.nextLine());
            switch (scelta){
                case 1:
                    sceltaAudio(audio, scn);
                    break;
                case 2:
                    sceltaVideo(video, scn);
                    break;
                case 3:
                    sceltaImmagine(immagine, scn);
                    break;
                case 4:
                    sceltaImmagine(immagine2, scn);
                    break;
                case 5:
                    sceltaAudio(audio2, scn);
                    break;
                case 0:
                    System.out.println("Uscita");
                    break;
                default:
                    System.out.println("Indice non presente");;
            }
        } while (scelta != 0);






    }
    public static void sceltaAudio(PlayerAudio audio, Scanner scn){
        String sel = "x";
        do {
            audio.play();
            System.out.println("+) Aumenta volume");
            System.out.println("-) Diminuisci volume");
            System.out.println("x) Esci");
            sel = scn.nextLine();
            if (sel.equals("+")) {
                audio.alzaVolume();
            } else if (sel.equals("-")){
                audio.abbassaVolume();
            }
            else if (sel.equals("x")) {
                System.out.println("Uscita...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                System.out.println("Scelta non permessa");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (!sel.equals("x"));
    }
    public static void sceltaVideo(PlayerVideo video, Scanner scn){
        String sel = "x";
        do {
            video.play();
            System.out.println("+) Aumenta volume");
            System.out.println("-) Diminuisci volume");
            System.out.println("l+) Aumenta luminosità");
            System.out.println("l-) Diminuisci luminosità");
            System.out.println("x) Esci");
            sel = scn.nextLine();
            if (sel.equals("+")) {
                video.alzaVolume();
            }
            else if (sel.equals("-")){
                video.abbassaVolume();

            }
            else if (sel.equals("l+")) {
                video.aumentaLuminosita();
            }
            else if (sel.equals("l-")) {
                video.diminuisciLuminosita();
            } else if (sel.equals("x")) {
                System.out.println("Uscita...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            } else {
                System.out.println("Scelta non permessa");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (!sel.equals("x"));
    }
    public static void sceltaImmagine (MyImage img, Scanner scn){
        String sel = "x";
        do {
            img.show();
            System.out.println("+) Aumenta volume");
            System.out.println("-) Diminuisci volume");
            System.out.println("l+) Aumenta luminosità");
            System.out.println("l-) Diminuisci luminosità");
            System.out.println("x) Esci");
            sel = scn.nextLine();

            if (sel.equals("l+")) {
                img.aumentaLuminosita();
            }
            else if (sel.equals("l-")) {
                img.diminuisciLuminosita();
            } else if (sel.equals("x")) {
                System.out.println("Uscita...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            } else {
                System.out.println("Scelta non permessa");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (!sel.equals("x"));
    }
}