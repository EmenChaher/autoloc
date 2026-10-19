package tn.esprit.tic.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.autoloc.domain.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

}
