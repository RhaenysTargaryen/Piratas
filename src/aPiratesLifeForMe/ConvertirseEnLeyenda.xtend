package aPiratesLifeForMe

import org.eclipse.xtend.lib.annotations.Accessors

class ConvertirseEnLeyenda implements Misiones{
	@Accessors String itemDeLeyenda 
	override boolean esUtil (Pirata unPirata){
		unPirata . tieneUnItem(itemDeLeyenda) 
		unPirata . tieneMasDeDiezItems
	}
	override def puedeSerRealizadaPor(BarcoPirata unBarco) {
		true
	}
}