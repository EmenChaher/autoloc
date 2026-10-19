package tn.esprit.tic.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.autoloc.domain.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {

}
