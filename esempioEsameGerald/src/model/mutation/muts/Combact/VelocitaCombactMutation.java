package model.mutation.muts.Combact;

import model.geralt.Geralt;
import model.geralt.Mutation;
import model.mutation.Abstract.CombatMutation;

public class VelocitaCombactMutation extends CombatMutation {
    public VelocitaCombactMutation(Geralt g){
        super(g,Mutation.Velocita);
    }
    @Override
    public void apply() {
        super.apply();
        g.setVelocita(g.getVelocita()+2);
    }

    @Override
    public void remove() {
        super.remove();
        g.setVelocita(g.getVelocita()-2);
    }
}
