package tn.esprit.tic.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.autoloc.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
