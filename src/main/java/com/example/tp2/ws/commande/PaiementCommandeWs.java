package com.example.tp2.ws.commande;

import com.example.tp2.bean.commande.PaiementCommande;
import com.example.tp2.service.commande.PaiementCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/paiementCommande/")
public class PaiementCommandeWs {
    @Autowired
    private PaiementCommandeService paiementCommandeService;

    @GetMapping("code/{code}")
    public PaiementCommande findByCode(@PathVariable String code) {
        return paiementCommandeService.findByCode(code);
    }

    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return paiementCommandeService.deleteByCode(code);
    }

    @GetMapping("")
    public List<PaiementCommande> findAll() {
        return paiementCommandeService.findAll();
    }

    @PostMapping("")
    public int save(@RequestBody PaiementCommande paiementCommande) {
        return paiementCommandeService.save(paiementCommande);
    }
}
