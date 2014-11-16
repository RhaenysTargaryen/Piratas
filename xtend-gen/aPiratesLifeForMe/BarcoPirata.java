package aPiratesLifeForMe;

import aPiratesLifeForMe.Mision;
import aPiratesLifeForMe.Pirata;
import aPiratesLifeForMe.Victima;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class BarcoPirata implements Victima {
  @Accessors
  private Set<Pirata> tripulacion = new HashSet<Pirata>();
  
  @Accessors
  private Mision misionActual;
  
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
  
  @Pure
  public Set<Pirata> getTripulacion() {
    return this.tripulacion;
  }
  
  public void setTripulacion(final Set<Pirata> tripulacion) {
    this.tripulacion = tripulacion;
  }
  
  @Pure
  public Mision getMisionActual() {
    return this.misionActual;
  }
  
  public void setMisionActual(final Mision misionActual) {
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
