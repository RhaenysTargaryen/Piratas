package aPiratesLifeForMe;

import aPiratesLifeForMe.BarcoPirata;
import aPiratesLifeForMe.Pirata;

@SuppressWarnings("all")
public interface Victima {
  public abstract boolean puedeSerSaqueadoPor(final Pirata unPirata);
  
  public abstract boolean esVulnerableA(final BarcoPirata unBarcoPirata);
}
