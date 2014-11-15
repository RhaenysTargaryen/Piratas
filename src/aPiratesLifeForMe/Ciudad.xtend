package aPiratesLifeForMe

import org.eclipse.xtend.lib.annotations.Accessors

class Ciudad implements Victima {
	@Accessors int cantidadDeHabitantes
	
	override puedeSerSaqueadoPor (Pirata unPirata){
		unPirata.nivelDeEbriedad >= 50
	}
	
	
	
}