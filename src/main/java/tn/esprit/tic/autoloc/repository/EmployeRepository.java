package tn.esprit.tic.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.autoloc.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
