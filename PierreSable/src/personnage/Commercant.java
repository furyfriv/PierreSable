package personnage;

public class Commercant extends Humain {
    
    public Commercant(String nom, String boisson, int argent) {
        super(nom, boisson, argent);
    }

    public int seFaireExtorquer() {
        int argentExtorque = getArgent();
        parler("J'ai tout perdu le monde est injuste...");
        return argentExtorque;
    }

    public void recevoir(int argent) {
        parler(argent+"sous! Je te remercie généreux donateur!");
    }
}

