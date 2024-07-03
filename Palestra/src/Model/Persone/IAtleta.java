package Model.Persone;

import Model.Enums.TipoDisciplina;
import Model.Enums.TipoRilevanza;

public interface IAtleta extends IPersona {
    public TipoDisciplina getTipoDisciplina();
    public TipoRilevanza getRilevanza();
}
