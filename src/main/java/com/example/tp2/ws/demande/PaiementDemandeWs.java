package com.example.tp2.ws.demande;

import com.example.tp2.bean.demande.PaiementDemande;
import com.example.tp2.service.demande.PaiementDemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/paiementDemande/")
public class PaiementDemandeWs {
    @Autowired
    private PaiementDemandeService paiementDemandeService;

    @GetMapping("ref/{ref}")
    public PaiementDemande findByRef(@PathVariable String ref) {
        return paiementDemandeService.findByRef(ref);
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return paiementDemandeService.deleteByRef(ref);
    }

    @GetMapping("")
    public List<PaiementDemande> findAll() {
        return paiementDemandeService.findAll();
    }

    @PostMapping("")
    public int save(@RequestBody PaiementDemande paiementDemande) {
        return paiementDemandeService.save(paiementDemande);
    }
}
