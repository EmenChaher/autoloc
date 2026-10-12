package tn.esprit.tic.autoloc.service

import tn.esprit.tic.autoloc.domain.Vehicule


interface IVehiculeService {
    val all: MutableList<Vehicule?>?
    fun getById(id: Long?): Vehicule?
    fun save(vehicule: Vehicule?): Vehicule?
    fun delete(id: Long?)
}