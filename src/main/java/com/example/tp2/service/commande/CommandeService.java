package com.example.tp2.service.commande;

import com.example.tp2.bean.commande.Commande;
import com.example.tp2.service.commande.dao.commande.CommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeDao commandeDao;

    public Commande findByRef(String ref) {
        return commandeDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return commandeDao.deleteByRef(ref);
    }

    public List<Commande> findAll() {
        return commandeDao.findAll();
    }

    public int save(Commande commande) {

        if (findByRef(commande.getRef()) != null) {
            return -1;
        } else {
            commandeDao.save(commande);
            return 1;
        }
    }

    public int update(Commande commande) {

        if (findByRef(commande.getRef()) == null) {
            return -1;
        } else {
            commandeDao.save(commande);
            return 1;
        }
    }

    public int payer(String ref, double montant) {
        Commande commande = commandeDao.findByRef(ref);
        if (commande == null) {
            return -1;
        } else if (commande.getTotal() < commande.getTotalPaye() + montant) {
            return -2;
        } else {
            double nvTotalPayer = commande.getTotalPaye() + montant;
            commande.setTotalPaye(nvTotalPayer);
            commandeDao.save(commande);
            return 1;
        }
    }

}




