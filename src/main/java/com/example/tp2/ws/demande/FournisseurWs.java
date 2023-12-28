package com.example.tp2.ws.demande;

import com.example.tp2.bean.demande.Fournisseur;
import com.example.tp2.service.demande.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/fournisseur/")
public class FournisseurWs {
    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping("ice/{ice}")
    public Fournisseur FindByIce(@PathVariable String ice) {
        return fournisseurService.findByIce(ice);
    }

    @DeleteMapping("ice/{ice}")
    public int deleteByIce(@PathVariable String ice) {
        return fournisseurService.deleteByIce(ice);
    }

    @GetMapping("")
    public List<Fournisseur> findAll() {
        return fournisseurService.findAll();
    }

    @PostMapping("")
    public int save(@RequestBody Fournisseur fournisseur) {
        return fournisseurService.save(fournisseur);
    }
}
