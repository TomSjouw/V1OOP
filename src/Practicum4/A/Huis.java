package Practicum4.A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr) {
        adres = adr;
        bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon p) {
        huisbaas = p;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public String toString() {
        return adres + " is gebouwd in " + bouwjaar;
    }
}
