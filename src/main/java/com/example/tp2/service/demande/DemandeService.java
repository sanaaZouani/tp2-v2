package com.example.tp2.service.demande;

import com.example.tp2.bean.demande.Demande;
import com.example.tp2.dao.demande.DemandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemandeService {
    @Autowired
    private DemandeDao demandeDao;

    public Demande findByRef(String ref) {
        return demandeDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return demandeDao.deleteByRef(ref);
    }

    public List<Demande> findAll() {
        return demandeDao.findAll();
    }

    public int save(Demande demande) {
        if (findByRef(demande.getRef()) != null) {
            return -1;
        } else {
            demandeDao.save(demande);
            return 1;
        }
    }

}
