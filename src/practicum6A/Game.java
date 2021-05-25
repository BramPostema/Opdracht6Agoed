package practicum6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }
    public double huidigeWaarde(){
        int huidigJaar = LocalDate.now().getYear();
        int jarenOud= huidigJaar - releaseJaar;
        double huidigeWaarde = nieuwprijs * (0.30*jarenOud);
        return huidigeWaarde;
    }

    public int getReleaseJaar() {
        return releaseJaar;
    }

    public boolean equals(Game andereObject){
        if(andereObject.getNaam().equals(this.getNaam()) && andereObject.getReleaseJaar()==this.getReleaseJaar()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Game: "+ naam +
                " releaseJaar=" + releaseJaar;
    }
}