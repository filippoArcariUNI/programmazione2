package model.mutation.Abstract;

import model.geralt.Geralt;
import model.geralt.Mutation;
import model.mutation.MutationInterface;

public abstract class AbstractMutation implements MutationInterface {
    private final Mutation m;
    protected Geralt g;
    public AbstractMutation(Geralt g, Mutation m){
        super();
        this.g=g;
        this.m=m;

    }

    @Override
    public void apply() {
        g.addMutation(m);
    }

    @Override
    public void remove() {
        g.removeMutation(m);
    }

    @Override
    public String toString() {
        return m.toString();
    }
}
