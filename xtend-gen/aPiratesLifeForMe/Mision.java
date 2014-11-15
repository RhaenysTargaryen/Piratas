package aPiratesLifeForMe;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Mision {
  @Accessors
  private int negrosEnLaMision;
  
  @Pure
  public int getNegrosEnLaMision() {
    return this.negrosEnLaMision;
  }
  
  public void setNegrosEnLaMision(final int negrosEnLaMision) {
    this.negrosEnLaMision = negrosEnLaMision;
  }
}
