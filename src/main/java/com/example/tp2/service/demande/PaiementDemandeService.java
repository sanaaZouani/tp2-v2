package com.example.tp2.service.demande;

import com.example.tp2.bean.demande.PaiementDemande;
import com.example.tp2.service.commande.dao.demande.PaiementDemandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaiementDemandeService {
    @Autowired
    private PaiementDemandeDao paiementDemandeDao;

    public PaiementDemande findByRef(String ref) {
        return paiementDemandeDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return paiementDemandeDao.deleteByRef(ref);
    }

    public List<PaiementDemande> findAll() {
        return paiementDemandeDao.findAll();
    }

    public int save(PaiementDemande paiementDemande) {
        if (findByRef(paiementDemande.getRef()) != null) {
            return -1;
        } else {
            paiementDemandeDao.save(paiementDemande);
            return 1;
        }
    }


}
