/**
 * Created by yassirhessane on 4/08/16.
 */
public abstract class Scooter {

    public String modele;
    public String couleur;
    public String puissance;


    public Scooter(String modele, String couleur, String puissance) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;

    }

    public abstract String afficherCaracteristique();
}
