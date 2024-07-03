package Model.Sorting;

import Model.Titolo;

import java.util.Comparator;

public class Tipo implements Comparator<Titolo> {
    @Override
    public int compare(Titolo o1, Titolo o2) {
        return o1.getCategoria().compareTo(o2.getCategoria());
    }
}
