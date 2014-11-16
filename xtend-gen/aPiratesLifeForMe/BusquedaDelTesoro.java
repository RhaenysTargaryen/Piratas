package aPiratesLifeForMe;

import aPiratesLifeForMe.BarcoPirata;
import aPiratesLifeForMe.Mision;
import aPiratesLifeForMe.Misiones;
import aPiratesLifeForMe.Pirata;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class BusquedaDelTesoro extends Mision implements Misiones {
  public boolean esUtil(final Pirata unPirata) {
    boolean _and = false;
    boolean _tieneItemsParaBusquedaDelTesoro = unPirata.tieneItemsParaBusquedaDelTesoro(this);
    if (!_tieneItemsParaBusquedaDelTesoro) {
      _and = false;
    } else {
      boolean _notieneMasDeCincoMonedas = unPirata.notieneMasDeCincoMonedas();
      _and = _notieneMasDeCincoMonedas;
    }
    return _and;
  }
  
  public boolean puedeSerRealizadaPor(final BarcoPirata unBarco) {
    return unBarco.unTripulanteTieneLaLlave();
  }
  
  @Accessors
  private List<String> itemsNecesarios = new LinkedList<String>();
  
  public boolean iniciarListaDeItems(final List<String> unosItems) {
    return this.itemsNecesarios.addAll(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("map", "bottleOfGrogXD", "compass")));
  }
  
  @Pure
  public List<String> getItemsNecesarios() {
    return this.itemsNecesarios;
  }
  
  public void setItemsNecesarios(final List<String> itemsNecesarios) {
    this.itemsNecesarios = itemsNecesarios;
  }
}
