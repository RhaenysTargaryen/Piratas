package aPiratesLifeForMe

import java.util.LinkedList
import java.util.List
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors

class Pirata {
	@Accessors List<String> itemsPersonales = new LinkedList()
	@Accessors int cantidadDeDinero
	@Accessors int nivelDeEbriedad

	def tieneAlgunItemDe(Set<String> unosItems) {
		itemsPersonales.exists[unItem|unosItems.contains(unItem)]
	}

	def cantidadDeItems() {
		itemsPersonales.size
	}

	def tieneUnItem(String unItem) {
		itemsPersonales.contains(unItem)
	}
	
	def estaPasadoDeGrogXD() {
		estaEbrio
	}
	
	def estaEbrio(){
		nivelDeEbriedad >= 90
	}

	def puedeSaquear(Victima unaVictima) {
		unaVictima.puedeSerSaqueadoPor(this)
	}

	def tieneItemsParaBusquedaDelTesoro()	{
		this . tieneUnItem("compass") || this . tieneUnItem ("map") || this . tieneUnItem ("botlleOfGrodXD")
	}
	
	def tieneMasDeCincoMonedas() {
		this.cantidadDeDinero >=5
	}

	def tieneMasDeDiezItems() {
		this.cantidadDeItems >=10
	}

}
