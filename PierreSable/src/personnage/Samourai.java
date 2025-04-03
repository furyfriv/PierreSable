package personnage;

public class Samourai extends Ronin {
	private String seigneur;
    public Samourai(String seigneur,String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.seigneur=seigneur;
		
	}
    
    public void direBonjour() {
        super.direBonjour();
        parler("Je suis fier de servir le seigneur "+ seigneur);
    } 
    
}

