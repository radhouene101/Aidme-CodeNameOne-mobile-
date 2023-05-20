package entities;

import java.util.List;

public class Categorie {
    private int id;
    private String nom_Categorie;

    public Categorie(int id, String nom_Categorie) {
        this.id = id;
        this.nom_Categorie = nom_Categorie;
    }

    public Categorie(String nom_Categorie) {
        this.nom_Categorie = nom_Categorie;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    private List<Produit> produits;

    public Categorie() {
    }

    public int getId() {
        return id;
    }

    public String getNom_Categorie() {
        return nom_Categorie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom_Categorie(String nom_Categorie) {
        this.nom_Categorie = nom_Categorie;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", nom_Categorie=" + nom_Categorie + '}';
    }


}
