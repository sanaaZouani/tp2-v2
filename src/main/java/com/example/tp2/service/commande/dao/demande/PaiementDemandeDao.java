package com.example.tp2.service.commande.dao.demande;

import com.example.tp2.bean.demande.PaiementDemande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementDemandeDao extends JpaRepository<PaiementDemande, Long> {
    PaiementDemande findByRef(String ref);

    int deleteByRef(String ref);
}
