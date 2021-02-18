package Practicum4.B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {
    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public double totaalPrijs() {
        return (100.0-huurder.getKorting())/100.0*(gehuurdeAuto.getPrijsPerDag()*aantalDagen);
    }

    public String toString() {
        String s = "";
        if (gehuurdeAuto == null) {
            s = "er is geen auto bekend";
            if (huurder == null) {
                s = s + "\ner is geen huurder bekend \naantal dagen: 0 en dat kost 0.0";
            } else {
                s = s + "\nop naam van: " + huurder + " (korting: " + huurder.getKorting() + "%) \naantal dagen: 0 en dat kost 0.0";
            }
        }
        else {
            s = s + "autotype:" + gehuurdeAuto;
            if (huurder == null) {
                s = s + "\ner is geen huurder bekend \naantal dagen: 0 en dat kost 0.0";
            } else {
                s = s + "\nop naam van: " + huurder + " (korting: " + huurder.getKorting() + "%) \naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            }
        }

        return s;
    }
}
