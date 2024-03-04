package transport;

import magazyn.Magazyn;
import towar.Kontener;

import java.util.ArrayList;

public abstract class Transport {
        private String rodzaj;
        protected ArrayList<Kontener> kontenery = new ArrayList<>();

        public String getRodzaj() {
                return rodzaj;
        }

        public void setRodzaj(String rodzaj) {
                this.rodzaj = rodzaj;
        }

        public void przetransportuj(Magazyn z, Magazyn dokad){
                System.out.printf("Transportuje z %s do %s, Rodzaj transportu %s\n", z, dokad, rodzaj);

        }
        public abstract int zaladuj(Kontener kontener);

        public Kontener rozladuj(){
                if(kontenery.isEmpty()) return null;
                return kontenery.remove(0);
        }
}
