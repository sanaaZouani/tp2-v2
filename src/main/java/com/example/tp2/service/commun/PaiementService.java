package com.example.tp2.service.commun;

import com.example.tp2.bean.commande.Commande;
import com.example.tp2.bean.commun.Paiement;
import com.example.tp2.service.commande.CommandeService;
import com.example.tp2.dao.commun.PaiementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaiementService {
    public Paiement findByCode(String code) {
        return paiementDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return paiementDao.deleteByCode(code);
    }

    public List<Paiement> findAll() {
        return paiementDao.findAll();
    }

    public int save(Paiement paiement, String refCommande) {
        Commande commande = commandeService.findByRef(refCommande);
        paiement.setCommande(commande);
        if (commande == null) {
            return -1;
        } else if (findByCode(paiement.getCode()) != null) {
            return -2;
        } else {
            paiementDao.save(paiement);
            double nvTotalPayer = commande.getTotalPaye() + paiement.getMontant();
            commande.setTotalPaye(nvTotalPayer);
            commandeService.update(commande);
            return 1;
        }
    }


    @Autowired
    private PaiementDao paiementDao;
    @Autowired
    private CommandeService commandeService;

}
