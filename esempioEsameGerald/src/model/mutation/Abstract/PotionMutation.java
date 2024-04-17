package model.mutation.Abstract;

import model.geralt.Geralt;
import model.geralt.Mutation;

public abstract class PotionMutation extends AbstractMutation{
    protected PotionMutation(Geralt g , Mutation m){
        super(g,m);
    }
    @Override
    public String toString() {
        return "Poison -> " +  super.toString() +"\n";
    }
}
