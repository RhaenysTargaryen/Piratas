package aPiratesLifeForMe;

import aPiratesLifeForMe.BarcoPirata;
import aPiratesLifeForMe.Pirata;

@SuppressWarnings("all")
public interface Misiones {
  public abstract boolean esUtil(final Pirata unPirata);
  
  public abstract boolean puedeSerRealizadaPor(final BarcoPirata unBarco);
}
