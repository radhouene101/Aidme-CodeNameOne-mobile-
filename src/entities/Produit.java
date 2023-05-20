package entities;

public class Produit {

    private int id ,quantite;
    private float prix;

    private String nom_produit,marque,description,image_produit,categorie_produit;

    public Produit(int id, int quantite, float prix, String nom_produit, String marque, String description, String image_produit, String categorie_produit) {
        this.id = id;
        this.quantite = quantite;
        this.prix = prix;
        this.nom_produit = nom_produit;
        this.marque = marque;
        this.description = description;
        this.image_produit = image_produit;
        this.categorie_produit = categorie_produit;
    }






    public void setCategorie_produit(String categorie_produit) {
        this.categorie_produit = categorie_produit;
    }


    public Produit() {
    }

    public Produit(String nom_produit, String description,int quantite, float prix, String categorie_produit, String image_produit, String marque) {
        this.nom_produit = nom_produit;
        this.description = description;

        this.quantite = quantite;
        this.prix = prix;
        this.categorie_produit = categorie_produit;

        this.image_produit = image_produit;
        this.marque = marque;

    }


    public String getCategorie_produit() {
        return categorie_produit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }



    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage_produit(String image_produit) {
        this.image_produit = image_produit;
    }

    public int getId() {
        return id;
    }

    public int getQuantite() {
        return quantite;
    }

    public float getPrix() {
        return prix;
    }



    public String getNom_produit() {
        return nom_produit;
    }

    public String getMarque() {
        return marque;
    }

    public String getDescription() {
        return description;
    }

    public String getImage_produit() {
        return image_produit;
    }







}
