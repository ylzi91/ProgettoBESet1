package Multimedia;

public class PlayerVideo extends Multimedia implements Lum, VolPlay {
    public PlayerVideo(String titolo, int volume, int luminosita, int durataMin) {
        super(titolo, volume, luminosita, durataMin);
    }



    @Override
    public void play() {
        for (int i = 0; i <= getDurataMin(); i++){
            System.out.println("Titolo: " + getTitolo());
        }
        for (int i = 0; i < getVolume(); i++){
            System.out.print("! ");
        }
        System.out.println("\n");
        for (int i = 0; i < getLuminosita(); i++){
            System.out.print("* ");
        }
        System.out.println("\n");
    }



    @Override
    public void aumentaLuminosita() {
        if(getLuminosita() < 10){
            setLuminosita(getLuminosita() + 1);
        }
        else {
            System.out.println("Luminosità al massimo");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if (getLuminosita() > 0) {
            setLuminosita(getLuminosita() - 1);
        }
        else {
            System.out.println("Luminosità al minimo");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void abbassaVolume() {
        if(getVolume() > 0){
            setVolume(getVolume() -1);
        }
        else {
            System.out.println("Volume al minimo");
        }
    }

    @Override
    public void alzaVolume() {
        if(getVolume() <= 10){
            setVolume(getVolume() + 1);
        }
        else {
            System.out.println("Volume al massimo");
        }
    }
}
