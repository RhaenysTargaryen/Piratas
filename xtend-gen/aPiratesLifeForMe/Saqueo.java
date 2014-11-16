package aPiratesLifeForMe;

import aPiratesLifeForMe.BarcoPirata;
import aPiratesLifeForMe.Misiones;
import aPiratesLifeForMe.Pirata;
import aPiratesLifeForMe.Victima;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Saqueo implements Misiones {
  @Accessors
  private Victima victima;
  
  @Accessors
  private int dineroMaximoParaPoderSaquear;
  
  public boolean esUtil(final Pirata unPirata) {
    boolean _and = false;
    boolean _tieneMenosDineroQue = unPirata.tieneMenosDineroQue(this.dineroMaximoParaPoderSaquear);
    if (!_tieneMenosDineroQue) {
      _and = false;
    } else {
      boolean _puedeSaquear = unPirata.puedeSaquear(this.victima);
      _and = _puedeSaquear;
    }
    return _and;
  }
  
  public boolean puedeSerRealizadaPor(final BarcoPirata unBarco) {
    return this.victima.esVulnerableA(unBarco);
  }
  
  @Pure
  public Victima getVictima() {
    return this.victima;
  }
  
  public void setVictima(final Victima victima) {
    this.victima = victima;
  }
  
  @Pure
  public int getDineroMaximoParaPoderSaquear() {
    return this.dineroMaximoParaPoderSaquear;
  }
  
  public void setDineroMaximoParaPoderSaquear(final int dineroMaximoParaPoderSaquear) {
    this.dineroMaximoParaPoderSaquear = dineroMaximoParaPoderSaquear;
  }
}
