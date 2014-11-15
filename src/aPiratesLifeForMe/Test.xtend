package aPiratesLifeForMe

import org.junit.Before
import org.junit.Assert
import org.junit.Test

class TestPiratas {
	Pirata barbaNegra

	@Before
	def void setUp() {
		barbaNegra = new Pirata
		barbaNegra.itemsPersonales.addAll(#["compass", "map", "knife", "goldTooth", "botlleOfGrodXD"])
		barbaNegra.cantidadDeDinero = 1000
		barbaNegra.nivelDeEbriedad = 50
	}

	@Test
	def void cantidadDeItems() {
		Assert.assertEquals(5, barbaNegra.cantidadDeItems)
	}
}
