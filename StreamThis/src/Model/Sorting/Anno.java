package Model.Sorting;

import Model.Titolo;

import java.util.Comparator;

public class Anno implements Comparator<Titolo> {
    @Override
    public int compare(Titolo o1, Titolo o2) {
        return (o1.getAnnoPubblicazione() - o2.getAnnoPubblicazione());
    }
}
