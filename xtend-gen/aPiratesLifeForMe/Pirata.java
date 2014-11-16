package aPiratesLifeForMe;

import aPiratesLifeForMe.BarcoPirata;
import aPiratesLifeForMe.BusquedaDelTesoro;
import aPiratesLifeForMe.Misiones;
import aPiratesLifeForMe.Victima;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Pirata {
  @Accessors
  private List<String> itemsPersonales = new LinkedList<String>();
  
  @Accessors
  private int cantidadDeDinero;
  
  @Accessors
  private int nivelDeEbriedad;
  
  public boolean tieneAlgunItemDe(final Set<String> unosItems) {
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      public Boolean apply(final String unItem) {
        return Boolean.valueOf(unosItems.contains(unItem));
      }
    };
    return IterableExtensions.<String>exists(this.itemsPersonales, _function);
  }
  
  public int cantidadDeItems() {
    return this.itemsPersonales.size();
  }
  
  public boolean tieneUnItem(final String unItem) {
    return this.itemsPersonales.contains(unItem);
  }
  
  public boolean estaPasadoDeGrogXD() {
    return this.estaEbrio();
  }
  
  public boolean estaEbrio() {
    return (this.nivelDeEbriedad >= 90);
  }
  
  public boolean puedeSaquear(final Victima unaVictima) {
    return unaVictima.puedeSerSaqueadoPor(this);
  }
  
  public boolean tieneItemsParaBusquedaDelTesoro(final BusquedaDelTesoro unaBusqueda) {
    List<String> _itemsNecesarios = unaBusqueda.getItemsNecesarios();
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      public Boolean apply(final String unItem) {
        return Boolean.valueOf(Pirata.this.tieneUnItem(unItem));
      }
    };
    return IterableExtensions.<String>exists(_itemsNecesarios, _function);
  }
  
  public boolean notieneMasDeCincoMonedas() {
    return (this.cantidadDeDinero <= 5);
  }
  
  public boolean tieneMasDeDiezItems() {
    int _cantidadDeItems = this.cantidadDeItems();
    return (_cantidadDeItems >= 10);
  }
  
  public boolean tieneMenosDineroQue(final int unaCantidadDeDinero) {
    return (this.cantidadDeDinero < unaCantidadDeDinero);
  }
  
  public int tomarUnTrago() {
    int _xblockexpression = (int) 0;
    {
      this.nivelDeEbriedad = (this.nivelDeEbriedad + 5);
      _xblockexpression = this.cantidadDeDinero--;
    }
    return _xblockexpression;
  }
  
  public boolean puedeUnirseA(final BarcoPirata unBarcoPirata) {
    boolean _and = false;
    boolean _elBarcoNoEstaLleno = unBarcoPirata.elBarcoNoEstaLleno();
    if (!_elBarcoNoEstaLleno) {
      _and = false;
    } else {
      Misiones _misionActual = unBarcoPirata.getMisionActual();
      boolean _esUtil = _misionActual.esUtil(this);
      _and = _esUtil;
    }
    return _and;
  }
  
  @Pure
  public List<String> getItemsPersonales() {
    return this.itemsPersonales;
  }
  
  public void setItemsPersonales(final List<String> itemsPersonales) {
    this.itemsPersonales = itemsPersonales;
  }
  
  @Pure
  public int getCantidadDeDinero() {
    return this.cantidadDeDinero;
  }
  
  public void setCantidadDeDinero(final int cantidadDeDinero) {
    this.cantidadDeDinero = cantidadDeDinero;
  }
  
  @Pure
  public int getNivelDeEbriedad() {
    return this.nivelDeEbriedad;
  }
  
  public void setNivelDeEbriedad(final int nivelDeEbriedad) {
    this.nivelDeEbriedad = nivelDeEbriedad;
  }
}
