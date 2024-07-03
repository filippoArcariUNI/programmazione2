package Model.Persone;

import Model.Enums.Corso;
import Model.Enums.Universita;

public interface IStudente extends IPersona {
    public Universita getUniversita();
    public Corso getCorso();
}
