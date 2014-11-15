package aPiratesLifeForMe;

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
  
  @Pure
  public int getCantidadDeHabitantes() {
    return this.cantidadDeHabitantes;
  }
  
  public void setCantidadDeHabitantes(final int cantidadDeHabitantes) {
    this.cantidadDeHabitantes = cantidadDeHabitantes;
  }
}
