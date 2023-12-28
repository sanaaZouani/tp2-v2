package com.example.tp2.bean.commande;

import jakarta.persistence.*;
import org.hibernate.boot.model.relational.ColumnOrderingStrategyStandard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private double total;
    private double totalPaye;
    private double totalPayeEspace;
    private double totalPayeChek;
    private String ref;
    private String dateCommande;
    @ManyToOne
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalPayeEspace() {
        return totalPayeEspace;
    }

    public void setTotalPayeEspace(double totalPayeEspace) {
        this.totalPayeEspace = totalPayeEspace;
    }

    public double getTotalPayeChek() {
        return totalPayeChek;
    }

    public void setTotalPayeChek(double totalPayeChek) {
        this.totalPayeChek = totalPayeChek;
    }

    public double getTotalPaye() {
        return totalPaye;
    }

    public void setTotalPaye(double totalPaye) {
        this.totalPaye = totalPaye;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }
}
