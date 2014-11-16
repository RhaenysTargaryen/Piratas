package aPiratesLifeForMe

import aPiratesLifeForMe.Pirata

class EspiaDeLaCorona extends Pirata {
	
	override def estaPasadoDeGrogXD(){
		return false
	}
	
	override def seAnimaASaquearA(Victima unaVictima) {
		seAnimaASaquearA(unaVictima) && itemsPersonales.contains("permiso de la corona")
	}
}