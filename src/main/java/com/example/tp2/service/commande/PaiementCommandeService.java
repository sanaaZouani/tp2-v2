package com.example.tp2.service.commande;

import com.example.tp2.bean.commande.PaiementCommande;
import com.example.tp2.dao.commande.PaiementCommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaiementCommandeService {
    @Autowired
    private PaiementCommandeDao paiementCommandeDao;

    public PaiementCommande findByCode(String code) {
        return paiementCommandeDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return paiementCommandeDao.deleteByCode(code);
    }

    public List<PaiementCommande> findAll() {
        return paiementCommandeDao.findAll();
    }

    public int save(PaiementCommande paiementCommande) {
        if (findByCode(paiementCommande.getCode()) != null) {
            return -1;
        } else {
            paiementCommandeDao.save(paiementCommande);
            return 1;
        }
    }

}
