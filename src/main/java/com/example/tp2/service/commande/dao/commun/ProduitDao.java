package com.example.tp2.service.commande.dao.commun;

import com.example.tp2.bean.commun.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {
    Produit findByRef(String ref);

    int deleteByRef(String ref);

}
