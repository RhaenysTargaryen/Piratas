package aPiratesLifeForMe;

import aPiratesLifeForMe.Mision;
import aPiratesLifeForMe.Misiones;
import aPiratesLifeForMe.Pirata;

@SuppressWarnings("all")
public class BusquedaDelTesoro extends Mision implements Misiones {
  public boolean esUtil(final Pirata unPirata) {
    return true;
  }
}
