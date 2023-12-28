package com.example.tp2.bean.commun;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rib;
    private double solde;
    private boolean ouvert;

    public Compte(Long id, String rib, double solde, boolean ouvert) {
        this.id = id;
        this.rib = rib;
        this.solde = solde;
        this.ouvert = ouvert;
    }

    public Compte() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }
}
