package personnage;

public class Ronin extends Humain {
    
    public Ronin(String nom, String boisson, int argent) {
        super(nom, boisson, argent);
        
    }

    public void donner(Commercant beneficiaire) {
        int somme = (int)(getArgent() * 0.1); 
        perdreArgent(somme);
        parler(beneficiaire.getNom() + " prend ces " + somme + " sous.");
        beneficiaire.recevoir(somme);
    }
    
    
    
    public void provoquer(Yakuza adversaire) {
        int honneur=1;
		int forceRonin = 2 * honneur;
        System.out.println(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
        if (forceRonin >= adversaire.Reputation()) {
            int gain = adversaire.perdre();
            super.gagnerArgent(gain);
            honneur++; 
            System.out.println(super.getNom() + " a gagné contre le Yakuza et a pris " + gain + " sous !");
        } else {
            
            int argentPerdu = super.getArgent();
            super.perdreArgent(argentPerdu);
            honneur--;
            System.out.println(" J'ai perdu contre le Yakuza, son honneur et sa bourse en ont pris un coup.");
            adversaire.gagner(argentPerdu);
        }
    }

	
}
