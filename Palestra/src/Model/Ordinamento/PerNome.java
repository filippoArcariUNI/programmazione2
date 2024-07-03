package Model.Ordinamento;

import Model.Persone.IPersona;

import java.util.Comparator;

public class PerNome implements Comparator<IPersona>{

    @Override
    public int compare(IPersona o1, IPersona o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
