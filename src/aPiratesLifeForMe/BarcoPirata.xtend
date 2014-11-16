package aPiratesLifeForMe

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.HashSet
import java.util.Set

class BarcoPirata implements Victima {
	@Accessors Set<Pirata> tripulacion = new HashSet
	@Accessors Mision misionActual
	@Accessors int tripulacionMaxima
	
	override puedeSerSaqueadoPor (Pirata unPirata){
		unPirata.estaPasadoDeGrogXD
	}
	def unTripulanteTieneLaLlave ()
	{
		tripulacion.exists[unPirata | unPirata.tieneUnItem("key")]
	}
}