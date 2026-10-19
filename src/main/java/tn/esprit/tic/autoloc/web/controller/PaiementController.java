package tn.esprit.tic.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.tic.autoloc.domain.Paiement;
import tn.esprit.tic.autoloc.service.PaiementService;

import java.util.List;

@Controller
@AllArgsConstructor
public class PaiementController {

    PaiementService paiementService;

    public List<Paiement> retrieveAllPaiements() {
        return paiementService.retrieveAllPaiements();
    }

    public Paiement addPaiement(Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    public Paiement updatePaiement(Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    public Paiement retrievePaiement(Long idPaiement) {
        return paiementService.retrievePaiement(idPaiement);
    }

    public void removePaiement(Long idPaiement) {
        paiementService.removePaiement(idPaiement);
    }

    public List<Paiement> addPaiements(List<Paiement> paiements) {
        return paiementService.addPaiements(paiements);
    }
}
