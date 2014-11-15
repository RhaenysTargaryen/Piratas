package aPiratesLifeForMe;

import aPiratesLifeForMe.Mision;
import aPiratesLifeForMe.Misiones;
import aPiratesLifeForMe.Pirata;

@SuppressWarnings("all")
public class BusquedaDelTesoro extends Mision implements Misiones {
  public boolean esUtil(final Pirata unPirata) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _tieneUnItem = unPirata.tieneUnItem("compass");
    if (_tieneUnItem) {
      _or_1 = true;
    } else {
      boolean _tieneUnItem_1 = unPirata.tieneUnItem("map");
      _or_1 = _tieneUnItem_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _and = false;
      boolean _tieneUnItem_2 = unPirata.tieneUnItem("botlleOfGrodXD");
      if (!_tieneUnItem_2) {
        _and = false;
      } else {
        int _cantidadDeDinero = unPirata.getCantidadDeDinero();
        boolean _greaterEqualsThan = (_cantidadDeDinero >= 5);
        _and = _greaterEqualsThan;
      }
      _or = _and;
    }
    return _or;
  }
}
