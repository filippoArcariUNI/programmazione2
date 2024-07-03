package Model.Ordinamento;

import Model.Persone.IPersona;

import java.util.Comparator;

public class PerEta implements Comparator<IPersona> {
    @Override
    public int compare(IPersona o1, IPersona o2) {
        return o1.getAnnoNascita() - o2.getAnnoNascita();
    }
}
