package Multimedia;

public abstract class Multimedia {
    private String titolo;
    private int volume;
    private int luminosita;
    private int durataMin;

    public Multimedia(String titolo, int volume, int luminosita, int durataMin) {
        this.titolo = titolo;
        this.volume = volume;
        this.luminosita = luminosita;
        this.durataMin = durataMin;
    }

    public Multimedia(String titolo, int volume, int durataMin) {
        this.titolo = titolo;
        this.volume = volume;
        this.durataMin = durataMin;
    }

    public Multimedia(String titolo, int luminosita) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }


    public String getTitolo() {
        return titolo;
    }

    public int getVolume() {
        return volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public int getDurataMin() {
        return durataMin;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    protected void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }


}
