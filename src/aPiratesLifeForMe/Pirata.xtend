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
	def seAnimaASaquearA(Victima unaVictima) {
		unaVictima.seLeAnima(this)
	}

	def tieneItemsParaBusquedaDelTesoro(BusquedaDelTesoro unaBusqueda)	{
		unaBusqueda.itemsNecesarios.exists[unItem | this.tieneUnItem(unItem)]
			}
	def notieneMasDeCincoMonedas() {
		cantidadDeDinero <=5
	}

	def tieneMasDeDiezItems() {
		cantidadDeItems >=10
	}
	def tieneMenosDineroQue(int unaCantidadDeDinero) {
		cantidadDeDinero < unaCantidadDeDinero
	}
	def tomarUnTrago() {
		nivelDeEbriedad = nivelDeEbriedad + 5
		cantidadDeDinero--
	}
	def puedeUnirseA(BarcoPirata unBarcoPirata) {
		unBarcoPirata.elBarcoNoEstaLleno && unBarcoPirata.misionActual.esUtil(this)
	}

}