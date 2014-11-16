package aPiratesLifeForMe;

import aPiratesLifeForMe.BarcoPirata;
import aPiratesLifeForMe.Pirata;
import aPiratesLifeForMe.Victima;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Ciudad implements Victima {
  @Accessors
  private int cantidadDeHabitantes;
  
  public boolean puedeSerSaqueadoPor(final Pirata unPirata) {
    int _nivelDeEbriedad = unPirata.getNivelDeEbriedad();
    return (_nivelDeEbriedad >= 50);
  }
  
  public int agregarCiudadano() {
    return this.cantidadDeHabitantes++;
  }
  
  public boolean esVulnerableA(final BarcoPirata unBarcoPirata) {
    boolean _or = false;
    int _cantidadDeTripulantes = unBarcoPirata.cantidadDeTripulantes();
    boolean _greaterEqualsThan = (_cantidadDeTripulantes >= (this.cantidadDeHabitantes * 0.4));
    if (_greaterEqualsThan) {
      _or = true;
    } else {
      boolean _dosEstanPasadosDeGrogXD = unBarcoPirata.todosEstanPasadosDeGrogXD();
      _or = _dosEstanPasadosDeGrogXD;
    }
    return _or;
  }
  
  @Pure
  public int getCantidadDeHabitantes() {
    return this.cantidadDeHabitantes;
  }
  
  public void setCantidadDeHabitantes(final int cantidadDeHabitantes) {
    this.cantidadDeHabitantes = cantidadDeHabitantes;
  }
}
