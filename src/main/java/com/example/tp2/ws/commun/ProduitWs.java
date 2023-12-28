package com.example.tp2.ws.commun;

import com.example.tp2.bean.commun.Produit;
import com.example.tp2.service.commun.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produit/")
public class ProduitWs {
    @Autowired
    private ProduitService produitService;

    @GetMapping("ref/{ref}")
    public Produit findByRef(@PathVariable String ref) {
        return produitService.findByRef(ref);
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return produitService.deleteByRef(ref);
    }

    @PostMapping("")
    public int save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @GetMapping("")
    public List<Produit> findAll() {
        return produitService.findAll();
    }
}
