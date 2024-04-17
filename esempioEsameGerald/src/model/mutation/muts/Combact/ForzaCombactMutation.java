package model.mutation.muts.Combact;

import model.geralt.Geralt;
import model.geralt.Mutation;
import model.mutation.Abstract.CombatMutation;

public class ForzaCombactMutation extends CombatMutation {
    public ForzaCombactMutation(Geralt g){
        super(g, Mutation.Forza);
    }
    @Override
    public void apply() {
        super.apply();
        g.setForza(g.getForza()+2);
    }
    @Override
    public void remove() {
        super.remove();
        g.setForza(g.getForza()-2);
    }

}
