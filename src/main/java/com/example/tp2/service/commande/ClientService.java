package com.example.tp2.service.commande;


import com.example.tp2.bean.commande.Client;
import com.example.tp2.service.commande.dao.commande.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientDao clientDao;

    public Client findByCin(String cin) {
        return clientDao.findByCin(cin);
    }

    @Transactional
    public int deleteByCin(String cin) {
        return clientDao.deleteByCin(cin);
    }

    public List<Client> findAll() {
        return clientDao.findAll();
    }

    public int save(Client client) {
        if (findByCin(client.getCin()) != null) {
            return -1;
        } else {
            clientDao.save(client);
            return 1;
        }
    }

    public int update(Client client) {
        if (findByCin(client.getCin()) == null) {
            return -1;
        } else {
            clientDao.save(client);
            return 1;
        }
    }


}
