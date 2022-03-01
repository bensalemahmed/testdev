package tn.esprit.spring.springbootdatajpaentity.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class DetailFacture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetailFature;
	private Integer qte;
	private float prixTotal;
	private Integer pourcentageRemise;
	private float montantRemise;

	@ManyToOne
	private Facture facture;

	@ManyToOne
	private Produit produit;

	public DetailFacture() {
		super();
	}

	public DetailFacture(Long idDetailFature, Integer qte, float prixTotal, Integer pourcentageRemise,
			float montantRemise, Facture facture, Produit produit) {
		super();
		this.idDetailFature = idDetailFature;
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
		this.facture = facture;
		this.produit = produit;
	}

	public Long getIdDetailFature() {
		return idDetailFature;
	}

	public void setIdDetailFature(Long idDetailFature) {
		this.idDetailFature = idDetailFature;
	}

	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Integer getPourcentageRemise() {
		return pourcentageRemise;
	}

	public void setPourcentageRemise(Integer pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}
