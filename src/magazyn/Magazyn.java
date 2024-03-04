package magazyn;

import towar.Kontener;

import java.util.ArrayList;

public class Magazyn {

    private String miasto;
    private ArrayList<Kontener> magazyn = new ArrayList<>();


    public Magazyn(String miasto) {
        this.miasto = miasto;
    }

    public void przyjmij(Kontener kontener){
        magazyn.add(kontener);
    }

    public Kontener wydaj(){
        if (magazyn.isEmpty()) return null;
        return magazyn.remove(0);
    }

    @Override
    public String toString(){
        return miasto;
    }

}
