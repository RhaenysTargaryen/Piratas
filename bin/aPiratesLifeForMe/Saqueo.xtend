package aPiratesLifeForMe

import org.eclipse.xtend.lib.annotations.Accessors

class Saqueo implements Misiones{
	@Accessors Victima victima
	@Accessors var int dineroMaximoParaPoderSaquear
	
	override boolean esUtil(Pirata unPirata) {
		unPirata.tieneMenosDineroQue(dineroMaximoParaPoderSaquear) && unPirata.puedeSaquear(victima)
	}

	override def puedeSerRealizadaPor(BarcoPirata unBarco) {
		victima.esVulnerableA(unBarco)
	}
}