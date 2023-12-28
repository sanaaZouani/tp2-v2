package com.example.tp2.dao.commande;

import com.example.tp2.bean.commande.PaiementCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementCommandeDao extends JpaRepository<PaiementCommande, Long> {
    PaiementCommande findByCode(String code);

    int deleteByCode(String code);
}
