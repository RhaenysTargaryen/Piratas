package aPiratesLifeForMe;

import aPiratesLifeForMe.Pirata;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class TestPiratas {
  private Pirata barbaNegra;
  
  @Before
  public void setUp() {
    Pirata _pirata = new Pirata();
    this.barbaNegra = _pirata;
    List<String> _itemsPersonales = this.barbaNegra.getItemsPersonales();
    _itemsPersonales.addAll(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("compass", "map", "knife", "goldTooth", "botlleOfGrodXD")));
    this.barbaNegra.setCantidadDeDinero(1000);
    this.barbaNegra.setNivelDeEbriedad(50);
  }
  
  @Test
  public void cantidadDeItems() {
    int _cantidadDeItems = this.barbaNegra.cantidadDeItems();
    Assert.assertEquals(5, _cantidadDeItems);
  }
}
