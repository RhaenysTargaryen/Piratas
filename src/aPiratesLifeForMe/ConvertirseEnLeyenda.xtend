package aPiratesLifeForMe

import aPiratesLifeForMe.Mision
import org.eclipse.xtend.lib.annotations.Accessors

class ConvertirseEnLeyenda extends Mision implements Misiones{
	@Accessors String itemDeLeyenda 
	override boolean esUtil (Pirata unPirata){
		unPirata . tieneUnItem(itemDeLeyenda) 
		unPirata . tieneMasDeDiezItems
	}
}