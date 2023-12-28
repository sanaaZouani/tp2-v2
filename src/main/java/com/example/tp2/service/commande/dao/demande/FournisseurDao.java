package com.example.tp2.service.commande.dao.demande;

import com.example.tp2.bean.demande.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur, Long> {
    Fournisseur findByIce(String ice);

    int deleteByIce(String ice);

}
