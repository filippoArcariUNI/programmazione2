package Models.Comparator;

import Models.Fans;

import java.util.Comparator;

public class CompData implements Comparator<Fans> {
    @Override
    public int compare(Fans o1, Fans o2) {
        if (o1.getCosto() == o2.getCosto()){
            return o1.getTipologia().getTipologia().name().compareTo(o2.getTipologia().getTipologia().name());
        }else if (o1.getCosto() < o2.getCosto()){
            return 1;
        }else{
            return -1;
        }
    }
}
