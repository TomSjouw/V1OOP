package Practicum2.B;

public class Voetbalclub {
    private String footballClub;
    private int aantalGewonnen = 0;
    private int aantalGelijk = 0;
    private int aantalVerloren = 0;

    public Voetbalclub(String fc) {
        footballClub = fc;
    }

    public int aantalGespeeld() {
        return aantalGewonnen+aantalGelijk+aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public int aantalPunten() {
        return (aantalGewonnen*3) + (aantalGelijk*1);
    }
    public String toString() {
        String s = footballClub + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
        return s;
    }
}
