package com.example.tp2.service.commun;

import com.example.tp2.bean.commun.Compte;
import com.example.tp2.service.commande.dao.commun.CompteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompteService {
    @Autowired
    private CompteDao compteDao;

    public Compte findByRib(String rib) {
        return compteDao.findByRib(rib);
    }

    @Transactional
    public int deleteByRib(String rib) {
        return compteDao.deleteByRib(rib);
    }

    public List<Compte> findAll() {
        return compteDao.findAll();
    }

    public int save(Compte compte) {
        if (findByRib(compte.getRib()) != null) {
            return -1;
        } else {
            compteDao.save(compte);
            return 1;
        }
    }

    public int debiter(String rib, double montant) {
        Compte compte = findByRib(rib);

        if (compte == null) {
            return -1;
        } else if (compte.isOuvert() == false) {
            return -2;
        } else {
            compte.setSolde(compte.getSolde() + montant);
            compteDao.save(compte);
            return 1;
        }
    }

    public int crediter(String rib, double montant) {
        Compte compte = findByRib(rib);

        if (compte == null) {
            return -1;
        } else if (compte.isOuvert() == false) {
            return -2;
        } else if (compte.getSolde() < montant) {
            return -3;
        } else {
            compte.setSolde(compte.getSolde() - montant);
            compteDao.save(compte);
            return 1;
        }
    }


    public int transferer(String ribSource, String ribDestination, double montant) {
        Compte source = findByRib(ribSource);
        Compte destination = findByRib(ribDestination);
        if (source == null) {
            return -1;
        } else if (destination == null) {
            return -2;
        } else if (!source.isOuvert()) {
            return -3;
        } else if (!destination.isOuvert()) {
            return -4;
        } else if (source.getSolde() < montant) {
            return -5;
        } else {
            double nvSource = source.getSolde() - montant;
            double nvDestination = destination.getSolde() + montant;
            source.setSolde(nvSource);
            destination.setSolde(nvDestination);
            compteDao.save(source);
            compteDao.save(destination);
            return 1;
        }

    }
}
