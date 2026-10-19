package tn.esprit.tic.autoloc.service;

import tn.esprit.tic.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    List<Vehicule> retrieveAllVehicules();
    Vehicule addVehicule(Vehicule v);
    Vehicule updateVehicule(Vehicule v);
    Vehicule retrieveVehicule(Long idVehicule);
    void removeVehicule(Long idVehicule);
    List<Vehicule> addVehicules(List<Vehicule> vehicules);
}
