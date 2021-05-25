package practicum6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games= new ArrayList<>();
    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return budget;
    }
    public boolean koop(Game g){
        double waarde = g.huidigeWaarde();
        if (waarde>getBudget()) {
            return false;
        }else{
            this.games.add(g);
            return true;
        }
    }
    public boolean verkoop(Game g, Persoon koper){
        if(this.games.remove(g)){
            koper.games.add(g);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam +
        ", budget=" + budget +
                '}';
    }



}