package com.example.tp2.ws.demande;

import com.example.tp2.bean.demande.Demande;
import com.example.tp2.service.demande.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/demande/")
public class DemandeWs {
    @Autowired
    private DemandeService demandeService;

    @GetMapping("ref/{ref}")
    public Demande findByRef(@PathVariable String ref) {
        return demandeService.findByRef(ref);
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return demandeService.deleteByRef(ref);
    }

    @GetMapping("")
    public List<Demande> findAll() {
        return demandeService.findAll();
    }

    @PostMapping("")
    public int save(@RequestBody Demande demande) {
        return demandeService.save(demande);
    }
}
