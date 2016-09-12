/**
 * Created by yassirhessane on 4/08/16.
 */
public class AutomobileEssence extends Automobile {



    public AutomobileEssence(String modele, String couleur, String puissance, String espace) {
        super(modele, couleur, puissance, espace);
    }


    @Override
    public String afficherCaracteristique() {
        return "Automobile Essence -> "+this.modele+" : "+ this.couleur+" : "+this.puissance+" : "+this.espace;
    }
}
