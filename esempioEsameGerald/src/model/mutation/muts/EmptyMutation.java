package model.mutation.muts;

import model.geralt.Geralt;
import model.geralt.Mutation;
import model.mutation.Abstract.AbstractMutation;

public class EmptyMutation extends AbstractMutation {

    public EmptyMutation(Geralt g){
        super(g, Mutation.Empty);
    }
    @Override
    public void apply() {
        g.setVelocita(g.getVelocita()+2);
    }

    @Override
    public void remove() {
        g.setVelocita(g.getVelocita()-2);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
