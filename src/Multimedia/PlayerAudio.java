package Multimedia;

public class PlayerAudio extends Multimedia implements VolPlay {
    public PlayerAudio(String titolo, int volume, int durataMin) {
        super(titolo, volume, durataMin);
    }

    /**
     *
     */


    @Override
    public void play() {
        for (int i = 0; i < getDurataMin(); i++){
            System.out.println("Titolo: " + getTitolo());
        }
        for (int i = 0; i < getVolume(); i++){
            System.out.print("! ");
        }
        System.out.println("\n");
    }
    @Override
    public void abbassaVolume() {
        if(getVolume() > 0){
            setVolume(getVolume() -1);
        }
        else {
            System.out.println("Volume al minimo");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void alzaVolume() {
        if(getVolume() < 10){
            setVolume(getVolume() + 1);
        }
        else {
            System.out.println("Volume al massimo");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
