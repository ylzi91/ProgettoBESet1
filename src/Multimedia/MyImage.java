package Multimedia;

public class MyImage extends Multimedia implements Lum {
    public MyImage(String titolo, int luminosita) {
        super(titolo, luminosita);
    }

    /**
     *
     */


    public void show(){
        for (int i = 0; i < getLuminosita(); i++){
            System.out.println("Titolo: " + getTitolo());
        }
        for (int i= 0; i < getLuminosita(); i++){
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
                Thread.sleep(1500);
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
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
