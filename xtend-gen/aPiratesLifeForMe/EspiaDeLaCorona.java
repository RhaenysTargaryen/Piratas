package aPiratesLifeForMe;

import aPiratesLifeForMe.Pirata;
import aPiratesLifeForMe.Victima;
import java.util.List;

@SuppressWarnings("all")
public class EspiaDeLaCorona extends Pirata {
  public boolean estaPasadoDeGrogXD() {
    return false;
  }
  
  public boolean seAnimaASaquearA(final Victima unaVictima) {
    boolean _and = false;
    boolean _seAnimaASaquearA = this.seAnimaASaquearA(unaVictima);
    if (!_seAnimaASaquearA) {
      _and = false;
    } else {
      List<String> _itemsPersonales = this.getItemsPersonales();
      boolean _contains = _itemsPersonales.contains("permiso de la corona");
      _and = _contains;
    }
    return _and;
  }
}
