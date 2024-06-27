package Models.Comparator;

import Models.Fans;

import java.util.Comparator;

public class CompTipologia implements Comparator<Fans> {
    @Override
    public int compare(Fans o1,Fans  o2) {

        if (o1.getTipologia().getTipologia().name().compareTo(o2.getTipologia().getTipologia().name())==0){
            if (o1.getCosto() < o2.getCosto()){
                return 1;
            }else{
                return -1;
            }
        }else{
            return o1.getTipologia().getTipologia().name().compareTo(o2.getTipologia().getTipologia().name());
        }
    }
}
