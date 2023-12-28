package com.example.tp2.ws.commun;

import com.example.tp2.bean.commun.Compte;
import com.example.tp2.service.commun.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/compte/")
@RestController
public class CompteWs {
    @Autowired
    CompteService compteService;

    @GetMapping("rib/{rib}")
    public Compte findByRib(String rib) {
        return compteService.findByRib(rib);
    }

    @DeleteMapping("rib/{rib}")
    public int deleteByRib(String rib) {
        return compteService.deleteByRib(rib);
    }

    @GetMapping("")
    public List<Compte> findAll() {
        return compteService.findAll();
    }

    @PutMapping("/transferer/ribSource/{ribSource}/ribDestination/{ribDestination}/montant/{montant}")
    public int transferer(@PathVariable String ribSource, @PathVariable String ribDestination, @PathVariable double montant) {
        return compteService.transferer(ribSource, ribDestination, montant);
    }

    @PutMapping("/debiter/rib/{rib}/montant/{montant}")
    public int debiter(@PathVariable String rib, @PathVariable double montant) {
        return compteService.debiter(rib, montant);
    }

    @PutMapping("/crediter/rib/{rib}/montant/{montant}")
    public int crediter(@PathVariable String rib, @PathVariable double montant) {
        return compteService.crediter(rib, montant);
    }

    @PostMapping("")
    public int save(@RequestBody Compte compte) {
        return compteService.save(compte);
    }
}
