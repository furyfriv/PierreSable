package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;
import personnage.*;

public class HistoireTP4 {
    public static void main(String[] args) {
      
        Humain prof = new Humain("Prof", "kombucha", 54);
        prof.direBonjour();
        prof.acheter("boisson", 12);
        prof.boire();
        prof.acheter("jeu", 2);   
        prof.acheter("kimono", 50);
        

        Commercant marco = new Commercant("Marco", "thé", 20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();

        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        yakuLeNoir.direBonjour();
        yakuLeNoir.extorquer(marco);

        Ronin roro = new Ronin("Roro", "shochu", 60);
        roro.direBonjour();
        roro.donner(marco);
        
        
        
        yakuLeNoir.direBonjour();
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
        
        roro.direBonjour();
        
        
        Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
        akimoto.direBonjour();
        
    }
}

