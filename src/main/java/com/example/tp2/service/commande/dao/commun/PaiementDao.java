package com.example.tp2.service.commande.dao.commun;

import com.example.tp2.bean.commun.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long> {
    Paiement findByCode(String code);

    int deleteByCode(String code);
}
