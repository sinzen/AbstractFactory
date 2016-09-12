/**
 * Created by yassirhessane on 4/08/16.
 */
public abstract class Automobile {

    public String modele;
    public String couleur;
    public String puissance;
    public String espace;

    public Automobile(String modele, String couleur, String puissance, String espace) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
        this.espace = espace;
    }

    public abstract String afficherCaracteristique();
}
