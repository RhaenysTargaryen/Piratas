package aPiratesLifeForMe

import aPiratesLifeForMe.Mision
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Set
import java.util.LinkedList
import java.util.List

class BusquedaDelTesoro extends Mision implements Misiones {
	
	override boolean esUtil(Pirata unPirata) {
		unPirata.tieneItemsParaBusquedaDelTesoro(this) && unPirata.notieneMasDeCincoMonedas
	}

	def puedeSerRealizadaPor(BarcoPirata unBarco) {
		unBarco.unTripulanteTieneLaLlave
	}
	@Accessors var List<String> itemsNecesarios = new LinkedList()
	
	def iniciarListaDeItems (List<String> unosItems) {
		itemsNecesarios.addAll(#["map", "bottleOfGrogXD", "compass"]) 
	}
	
}
