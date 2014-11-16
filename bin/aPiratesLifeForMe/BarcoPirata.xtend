package aPiratesLifeForMe

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.HashSet
import java.util.Set

class BarcoPirata implements Victima {
	@Accessors Set<Pirata> tripulacion = new HashSet
	@Accessors Misiones misionActual
	@Accessors int tripulacionMaxima
	
	override puedeSerSaqueadoPor (Pirata unPirata){
		unPirata.estaPasadoDeGrogXD
	}
	def unTripulanteTieneLaLlave ()
	{
		tripulacion.exists[unPirata | unPirata.tieneUnItem("key")]
	}
	def extraviarAlMasEbrioEn (Ciudad unaCiudad) {
		tripulacion.remove(pirataMasEbrio)
		unaCiudad.agregarCiudadano
	}
	def pirataMasEbrio() {
		tripulacion.maxBy[unPirata | unPirata.nivelDeEbriedad]
		}
	def puedeRealizar(Misiones unaMision) {
		tripulacionAl90PorCientoOMas && (unaMision.puedeSerRealizadaPor(this))
	}
	def tripulacionAl90PorCientoOMas() {
		cantidadDeTripulantes >= (tripulacionMaxima * 0.9)
	}
	override esVulnerableA(BarcoPirata unBarcoPirata) {
		cantidadDeTripulantes <= (unBarcoPirata.tripulacion.size / 2)
	}
	def cantidadDeTripulantes() {
		tripulacion.size
	}
	def todosEstanPasadosDeGrogXD() {
		tripulacion.forall[unPirata | unPirata.estaPasadoDeGrogXD]
	}
	def cantidadDeTripulantesPasadosDeGrogXD() {
		tripulantesPasadosDeGrogXD.size
	}
	def tripulantesPasadosDeGrogXD() {
		tripulacion.filter[unPirata | unPirata.estaPasadoDeGrogXD]
	}
	def elEbrioMasRicoDelBarco() {
		tripulantesPasadosDeGrogXD.maxBy[unPirata | unPirata.cantidadDeDinero]
	}
	def anclarEnCiudad(Ciudad unaCiudad) {
		laTripulacionSeVaDeFiesta
		extraviarAlMasEbrioEn(unaCiudad)
	}
	def laTripulacionSeVaDeFiesta() {
		tripulacion.forEach[unPirata | unPirata.tomarUnTrago]
	}
	def elBarcoNoEstaLleno(){
		tripulacion.size < tripulacionMaxima
	}
	def incoporarTripulante(Pirata unPirata) {
		if (elBarcoNoEstaLleno && misionActual.esUtil(unPirata))
			agregarTripulante(unPirata)
	}
	def agregarTripulante(Pirata unPirata) {
		tripulacion.add(unPirata)
	}
	def cambiarMision(Misiones unaMision) {
		misionActual = unaMision
		echarALosInutiles
	}
	def echarALosInutiles() {
		tripulacion.removeIf[unPirata | misionActual.esUtil(unPirata)]
	}
	def esTemible() {
		misionActual.puedeSerRealizadaPor(this)
	}
	override def seLeAnima(Pirata unPirata) {
		unPirata.estaPasadoDeGrogXD
	}
}