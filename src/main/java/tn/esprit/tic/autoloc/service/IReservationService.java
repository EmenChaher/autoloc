package tn.esprit.tic.autoloc.service;

import tn.esprit.tic.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> retrieveAllReservations();
    Reservation addReservation(Reservation r);
    Reservation updateReservation(Reservation r);
    Reservation retrieveReservation(Long idReservation);
    void removeReservation(Long idReservation);
    List<Reservation> addReservations (List<Reservation> reservations);
}
