package com.example.tp2.dao.commande;

import com.example.tp2.bean.commande.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
    Client findByCin(String cin);

    int deleteByCin(String cin);
}
