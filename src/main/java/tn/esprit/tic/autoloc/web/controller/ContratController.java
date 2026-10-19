package tn.esprit.tic.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.tic.autoloc.domain.Contrat;
import tn.esprit.tic.autoloc.service.ContratService;

import java.util.List;

@Controller
@AllArgsConstructor
public class ContratController {

    ContratService contratService;

    public List<Contrat> retrieveAllContrats() {
        return contratService.retrieveAllContrats();
    }

    public Contrat addContrat(Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    public Contrat updateContrat(Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    public Contrat retrieveContrat(Long idContrat) {
        return contratService.retrieveContrat(idContrat);
    }

    public void removeContrat(Long idContrat) {
        contratService.removeContrat(idContrat);
    }

    public List<Contrat> addContrats(List<Contrat> contrats) {
        return contratService.addContrats(contrats);
    }
}
