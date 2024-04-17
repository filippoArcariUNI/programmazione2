package model.mutation.muts.spell;

import model.geralt.Geralt;
import model.geralt.Mutation;
import model.geralt.Spell;
import model.mutation.Abstract.SpellMutation;

public class QuenSpellMutation extends SpellMutation {
    public QuenSpellMutation(Geralt g){
        super(g, Mutation.Quen);
    }
    @Override
    public void apply() {
        super.apply();
        g.addSpell(Spell.Quen);
    }

    @Override
    public void remove() {
        super.remove();
        g.removeSpell(Spell.Quen);
    }
}
