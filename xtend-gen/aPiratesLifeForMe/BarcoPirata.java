package aPiratesLifeForMe;

import aPiratesLifeForMe.Ciudad;
import aPiratesLifeForMe.Misiones;
import aPiratesLifeForMe.Pirata;
import aPiratesLifeForMe.Victima;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class BarcoPirata implements Victima {
  @Accessors
  private Set<Pirata> tripulacion = new HashSet<Pirata>();
  
  @Accessors
  private Misiones misionActual;
  
  @Accessors
  private int tripulacionMaxima;
  
  public boolean puedeSerSaqueadoPor(final Pirata unPirata) {
    return unPirata.estaPasadoDeGrogXD();
  }
  
  public boolean unTripulanteTieneLaLlave() {
    final Function1<Pirata, Boolean> _function = new Function1<Pirata, Boolean>() {
      public Boolean apply(final Pirata unPirata) {
        return Boolean.valueOf(unPirata.tieneUnItem("key"));
      }
    };
    return IterableExtensions.<Pirata>exists(this.tripulacion, _function);
  }
  
  public int extraviarAlMasEbrioEn(final Ciudad unaCiudad) {
    int _xblockexpression = (int) 0;
    {
      Pirata _pirataMasEbrio = this.pirataMasEbrio();
      this.tripulacion.remove(_pirataMasEbrio);
      _xblockexpression = unaCiudad.agregarCiudadano();
    }
    return _xblockexpression;
  }
  
  public Pirata pirataMasEbrio() {
    final Function1<Pirata, Integer> _function = new Function1<Pirata, Integer>() {
      public Integer apply(final Pirata unPirata) {
        return Integer.valueOf(unPirata.getNivelDeEbriedad());
      }
    };
    return IterableExtensions.<Pirata, Integer>maxBy(this.tripulacion, _function);
  }
  
  public boolean puedeRealizar(final Misiones unaMision) {
    boolean _and = false;
    boolean _tripulacionAl90PorCientoOMas = this.tripulacionAl90PorCientoOMas();
    if (!_tripulacionAl90PorCientoOMas) {
      _and = false;
    } else {
      boolean _puedeSerRealizadaPor = unaMision.puedeSerRealizadaPor(this);
      _and = _puedeSerRealizadaPor;
    }
    return _and;
  }
  
  public boolean tripulacionAl90PorCientoOMas() {
    int _cantidadDeTripulantes = this.cantidadDeTripulantes();
    return (_cantidadDeTripulantes >= (this.tripulacionMaxima * 0.9));
  }
  
  public boolean esVulnerableA(final BarcoPirata unBarcoPirata) {
    int _cantidadDeTripulantes = this.cantidadDeTripulantes();
    int _size = unBarcoPirata.tripulacion.size();
    int _divide = (_size / 2);
    return (_cantidadDeTripulantes <= _divide);
  }
  
  public int cantidadDeTripulantes() {
    return this.tripulacion.size();
  }
  
  public boolean todosEstanPasadosDeGrogXD() {
    final Function1<Pirata, Boolean> _function = new Function1<Pirata, Boolean>() {
      public Boolean apply(final Pirata unPirata) {
        return Boolean.valueOf(unPirata.estaPasadoDeGrogXD());
      }
    };
    return IterableExtensions.<Pirata>forall(this.tripulacion, _function);
  }
  
  public int cantidadDeTripulantesPasadosDeGrogXD() {
    Iterable<Pirata> _tripulantesPasadosDeGrogXD = this.tripulantesPasadosDeGrogXD();
    return IterableExtensions.size(_tripulantesPasadosDeGrogXD);
  }
  
  public Iterable<Pirata> tripulantesPasadosDeGrogXD() {
    final Function1<Pirata, Boolean> _function = new Function1<Pirata, Boolean>() {
      public Boolean apply(final Pirata unPirata) {
        return Boolean.valueOf(unPirata.estaPasadoDeGrogXD());
      }
    };
    return IterableExtensions.<Pirata>filter(this.tripulacion, _function);
  }
  
  public Pirata elEbrioMasRicoDelBarco() {
    Iterable<Pirata> _tripulantesPasadosDeGrogXD = this.tripulantesPasadosDeGrogXD();
    final Function1<Pirata, Integer> _function = new Function1<Pirata, Integer>() {
      public Integer apply(final Pirata unPirata) {
        return Integer.valueOf(unPirata.getCantidadDeDinero());
      }
    };
    return IterableExtensions.<Pirata, Integer>maxBy(_tripulantesPasadosDeGrogXD, _function);
  }
  
  public int anclarEnCiudad(final Ciudad unaCiudad) {
    int _xblockexpression = (int) 0;
    {
      this.laTripulacionSeVaDeFiesta();
      _xblockexpression = this.extraviarAlMasEbrioEn(unaCiudad);
    }
    return _xblockexpression;
  }
  
  public void laTripulacionSeVaDeFiesta() {
    final Consumer<Pirata> _function = new Consumer<Pirata>() {
      public void accept(final Pirata unPirata) {
        unPirata.tomarUnTrago();
      }
    };
    this.tripulacion.forEach(_function);
  }
  
  public boolean elBarcoNoEstaLleno() {
    int _size = this.tripulacion.size();
    return (_size < this.tripulacionMaxima);
  }
  
  public boolean incoporarTripulante(final Pirata unPirata) {
    boolean _xifexpression = false;
    boolean _and = false;
    boolean _elBarcoNoEstaLleno = this.elBarcoNoEstaLleno();
    if (!_elBarcoNoEstaLleno) {
      _and = false;
    } else {
      boolean _esUtil = this.misionActual.esUtil(unPirata);
      _and = _esUtil;
    }
    if (_and) {
      _xifexpression = this.agregarTripulante(unPirata);
    }
    return _xifexpression;
  }
  
  public boolean agregarTripulante(final Pirata unPirata) {
    return this.tripulacion.add(unPirata);
  }
  
  public boolean cambiarMision(final Misiones unaMision) {
    boolean _xblockexpression = false;
    {
      this.misionActual = unaMision;
      _xblockexpression = this.echarALosInutiles();
    }
    return _xblockexpression;
  }
  
  public boolean echarALosInutiles() {
    final Predicate<Pirata> _function = new Predicate<Pirata>() {
      public boolean test(final Pirata unPirata) {
        return BarcoPirata.this.misionActual.esUtil(unPirata);
      }
    };
    return this.tripulacion.removeIf(_function);
  }
  
  public boolean esTemible() {
    return this.misionActual.puedeSerRealizadaPor(this);
  }
  
  @Pure
  public Set<Pirata> getTripulacion() {
    return this.tripulacion;
  }
  
  public void setTripulacion(final Set<Pirata> tripulacion) {
    this.tripulacion = tripulacion;
  }
  
  @Pure
  public Misiones getMisionActual() {
    return this.misionActual;
  }
  
  public void setMisionActual(final Misiones misionActual) {
    this.misionActual = misionActual;
  }
  
  @Pure
  public int getTripulacionMaxima() {
    return this.tripulacionMaxima;
  }
  
  public void setTripulacionMaxima(final int tripulacionMaxima) {
    this.tripulacionMaxima = tripulacionMaxima;
  }
}
