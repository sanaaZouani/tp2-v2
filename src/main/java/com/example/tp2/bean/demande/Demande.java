package com.example.tp2.bean.demande;

import jakarta.persistence.*;

@Entity
public class Demande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double total;
    private double totalPaye;
    private double totalPayeEspece;
    private double totalPayechek;
    private String ref;
    @ManyToOne
    private Fournisseur fournisseur;

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
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

    public double getTotalPaye() {
        return totalPaye;
    }

    public void setTotalPaye(double totalPaye) {
        this.totalPaye = totalPaye;
    }

    public double getTotalPayeEspece() {
        return totalPayeEspece;
    }

    public void setTotalPayeEspece(double totalPayeEspece) {
        this.totalPayeEspece = totalPayeEspece;
    }

    public double getTotalPayechek() {
        return totalPayechek;
    }

    public void setTotalPayechek(double totalPayechek) {
        this.totalPayechek = totalPayechek;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
