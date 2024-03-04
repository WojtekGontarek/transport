package transport;

import towar.Kontener;

public class Pociag extends Transport{
    private static final int ROZMIAR = 20;
    public Pociag() {
        super();
        setRodzaj("Pociag");
    }

    @Override
    public int zaladuj(Kontener kontener){
        if (kontenery.size() == ROZMIAR) return 0;
        kontenery.add(kontener);
        return ROZMIAR-kontenery.size();
    }
}
