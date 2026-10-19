package tn.esprit.tic.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.autoloc.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {

}
