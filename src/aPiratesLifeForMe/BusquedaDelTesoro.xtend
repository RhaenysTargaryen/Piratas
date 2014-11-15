package aPiratesLifeForMe

import aPiratesLifeForMe.Mision

class BusquedaDelTesoro extends Mision implements Misiones{
	
	override boolean esUtil (Pirata unPirata){
		unPirata.tieneItemsParaBusquedaDelTesoro && unPirata.tieneMasDeCincoMonedas
	}
	def puedeSerRealizadaPor(BarcoPirata unBarco){
		unBarco.tripulacion.exists[unPirata | unPirata.tieneUnItem("key")]
	}
}