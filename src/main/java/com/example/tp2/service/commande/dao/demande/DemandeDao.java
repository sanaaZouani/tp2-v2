package com.example.tp2.service.commande.dao.demande;

import com.example.tp2.bean.demande.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeDao extends JpaRepository<Demande, Long> {
    Demande findByRef(String ref);

    int deleteByRef(String ref);
}
