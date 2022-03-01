package tn.esprit.spring.springbootdatajpaentity.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Fournisseur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFournisseur;
	private String code;
	private String lib;
	
	@ManyToMany(mappedBy = "fournisseurs")
	private List<Produit> produits;

	public Fournisseur() {
		super();
	}

	public Fournisseur(Long idFournisseur, String code, String lib, List<Produit> produits) {
		super();
		this.idFournisseur = idFournisseur;
		this.code = code;
		this.lib = lib;
		this.produits = produits;
	}
	
	
	public Long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
}
