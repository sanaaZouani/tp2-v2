package com.example.tp2.service.demande;

import com.example.tp2.bean.demande.Fournisseur;
import com.example.tp2.dao.demande.FournisseurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurDao fournisseurDao;

    public Fournisseur findByIce(String ice) {
        return fournisseurDao.findByIce(ice);
    }

    @Transactional
    public int deleteByIce(String ice) {
        return fournisseurDao.deleteByIce(ice);
    }

    public List<Fournisseur> findAll() {
        return fournisseurDao.findAll();
    }

    public int save(Fournisseur fournisseur) {
        if (findByIce(fournisseur.getIce()) != null) {
            return -1;
        } else {
            fournisseurDao.save(fournisseur);
            return 1;
        }
    }


}
