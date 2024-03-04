package transport;

import towar.Kontener;

public class Ciezarowka extends Transport{
    private static final int ROZMIAR = 1;
    public Ciezarowka() {
        super();
        setRodzaj("Ciezarowka");
    }

    @Override
    public int zaladuj(Kontener kontener){
        if (kontenery.size() == ROZMIAR) return 0;
        kontenery.add(kontener);
        return ROZMIAR-kontenery.size();
    }
}
