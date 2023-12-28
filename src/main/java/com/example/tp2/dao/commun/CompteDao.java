package com.example.tp2.dao.commun;

import com.example.tp2.bean.commun.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteDao extends JpaRepository<Compte, Long> {
    Compte findByRib(String rib);

    int deleteByRib(String rib);
}
