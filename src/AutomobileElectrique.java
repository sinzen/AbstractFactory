/**
 * Created by yassirhessane on 4/08/16.
 */
public class AutomobileElectrique extends Automobile {



    public AutomobileElectrique(String modele, String couleur, String puissance, String espace) {
        super(modele, couleur, puissance, espace);
    }

    @Override
    public String afficherCaracteristique() {
        return "Automobile Electrique ->"+this.modele+" : "+this.couleur+" : "+this.puissance+" : "+this.espace;
    }
}
