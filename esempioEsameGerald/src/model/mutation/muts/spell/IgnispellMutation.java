package model.mutation.muts.spell;

import model.geralt.Geralt;
import model.geralt.Mutation;
import model.geralt.Spell;
import model.mutation.Abstract.SpellMutation;

public class IgnispellMutation extends SpellMutation {
    public IgnispellMutation(Geralt g){
        super(g, Mutation.Igni);
    }

    @Override
    public void apply() {
        super.apply();
        g.addSpell(Spell.Igni);
    }

    @Override
    public void remove() {
        super.remove();
        g.removeSpell(Spell.Igni);
    }
}
