package model.mutation.muts.poison;

import model.geralt.Geralt;
import model.geralt.Mutation;
import model.mutation.Abstract.PotionMutation;

public class TollerazaPotionMutation extends PotionMutation {
    public  TollerazaPotionMutation(Geralt g){
        super(g, Mutation.Tolleranza);
    }
    @Override
    public void apply() {
        super.apply();
       g.setTolleranza(g.getTolleranza() + 2);
    }

    @Override
    public void remove() {
        super.remove();
        g.setTolleranza(g.getTolleranza() - 2);
    }
}
