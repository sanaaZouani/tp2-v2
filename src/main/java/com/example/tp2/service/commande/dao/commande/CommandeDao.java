package com.example.tp2.service.commande.dao.commande;

import com.example.tp2.bean.commande.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Long> {
    Commande findByRef(String ref);

    int deleteByRef(String ref);

}
