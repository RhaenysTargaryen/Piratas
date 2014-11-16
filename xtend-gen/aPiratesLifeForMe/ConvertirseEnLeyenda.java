package aPiratesLifeForMe;

import aPiratesLifeForMe.BarcoPirata;
import aPiratesLifeForMe.Misiones;
import aPiratesLifeForMe.Pirata;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class ConvertirseEnLeyenda implements Misiones {
  @Accessors
  private String itemDeLeyenda;
  
  public boolean esUtil(final Pirata unPirata) {
    boolean _xblockexpression = false;
    {
      unPirata.tieneUnItem(this.itemDeLeyenda);
      _xblockexpression = unPirata.tieneMasDeDiezItems();
    }
    return _xblockexpression;
  }
  
  public boolean puedeSerRealizadaPor(final BarcoPirata unBarco) {
    return true;
  }
  
  @Pure
  public String getItemDeLeyenda() {
    return this.itemDeLeyenda;
  }
  
  public void setItemDeLeyenda(final String itemDeLeyenda) {
    this.itemDeLeyenda = itemDeLeyenda;
  }
}
