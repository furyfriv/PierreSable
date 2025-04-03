package personnage;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String boisson, int argent, String clan) {
        super(nom, boisson, argent);
        this.clan = clan;
        this.reputation = 0;
        
    }

    public void direBonjour() {
        super.direBonjour();
        parler("Mon clan est celui de "+ clan);
    } 
    
    
    public void extorquer(Commercant victime) {
        int argentExtorque = victime.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation++;
        parler("J�ai piqu� les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }
    
    
    public void gagner(int gain) {
        super.gagnerArgent(gain);
        reputation++;
        System.out.println(super.getNom() + " a gagn� le duel et a pris " + gain + " sous � son adversaire, ce qui augmente sa r�putation !");
    }

    public int Reputation() {
        return reputation;
    }

	public int perdre() {
		
		return 0;
	}
	
	
}