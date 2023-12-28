package com.example.tp2.service.commun;

import com.example.tp2.bean.commun.Produit;
import com.example.tp2.service.commande.dao.commun.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;

    public Produit findByRef(String ref) {
        return produitDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return produitDao.deleteByRef(ref);
    }

    public int save(Produit produit) {
        if (findByRef(produit.getRef()) != null) {
            return -1;
        } else {
            produitDao.save(produit);
            return 1;
        }
    }

    public List<Produit> findAll() {
        return produitDao.findAll();
    }

}
