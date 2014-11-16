package aPiratesLifeForMe

import org.eclipse.xtend.lib.annotations.Accessors

class Ciudad implements Victima {
	@Accessors int cantidadDeHabitantes
	
	override puedeSerSaqueadoPor (Pirata unPirata){
		unPirata.nivelDeEbriedad >= 50
	}
	def agregarCiudadano() {
		cantidadDeHabitantes++
	}
	override esVulnerableA(BarcoPirata unBarcoPirata) {
		unBarcoPirata.cantidadDeTripulantes >= (cantidadDeHabitantes * 0.4) || unBarcoPirata.todosEstanPasadosDeGrogXD
	}
	
}