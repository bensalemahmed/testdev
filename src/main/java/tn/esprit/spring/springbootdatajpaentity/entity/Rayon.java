package tn.esprit.spring.springbootdatajpaentity.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Rayon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRayon;
	private String code;
	private String lib;

	public Rayon() {
		super();
	}

	public Rayon(Long idRayon, String code, String lib, List<Produit> produits) {
		super();
		this.idRayon = idRayon;
		this.code = code;
		this.lib = lib;
		this.produits = produits;
	}

	@OneToMany(mappedBy = "rayon")
	private List<Produit> produits;

	public Long getIdRayon() {
		return idRayon;
	}

	public void setIdRayon(Long idRayon) {
		this.idRayon = idRayon;
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
