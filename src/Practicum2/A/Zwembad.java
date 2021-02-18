package Practicum2.A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(){
    }

    public Zwembad(double br, double le, double di){
        breedte = br;
        lengte = le;
        diepte = di;
    }

    public double getBreedte() {
        return breedte;
    }
    public double getLengte() {
        return lengte;
    }
    public double getDiepte() {
        return diepte;
    }
    public double inhoud(){
        double inhoud = breedte * lengte * diepte;
        return inhoud;
    }
    public void setBreedte(double nwBr) {
        breedte = nwBr;
    }
    public void setLengte(double nwLe) {
        lengte = nwLe;
    }
    public void setDiepte(double nwDi) {
        diepte = nwDi;
    }
    public String toString() {
        String gegevens = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
        return gegevens;
    }
}