package towar;

import java.security.cert.TrustAnchor;

public class Kontener {
    private Towar towar;

    public boolean zaladuj(Towar towar){
        if(this.towar == null){
            this.towar = towar;
            return true;
        }
        return false;
    }
    public void rozladuj(){
        towar = null;
    }
}
