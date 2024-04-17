import model.geralt.Geralt;
import model.mutation.Abstract.CombatMutation;
import model.mutation.MutationInterface;
import model.mutation.muts.Combact.ForzaCombactMutation;
import model.mutation.muts.Combact.VelocitaCombactMutation;
import model.mutation.muts.poison.TollerazaPotionMutation;
import model.mutation.muts.spell.IgnispellMutation;
import model.mutation.muts.spell.QuenSpellMutation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Geralt g = new Geralt();
        System.out.println(g);
        MutationInterface forza = new ForzaCombactMutation(g);
        forza.apply();
        MutationInterface tolleranza = new TollerazaPotionMutation(g);
        tolleranza.apply();
        MutationInterface velocita = new VelocitaCombactMutation(g);
        velocita.apply();
        MutationInterface spell = new QuenSpellMutation(g);
        spell.apply();
        MutationInterface igni = new IgnispellMutation(g);
        igni.apply();
        System.out.println(g);

    }
}