package tn.esprit.spring.springbootdatajpaentity.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStock;
	
	private Integer qte;
	private Integer qteMin;
	private String libStock;
	
	@OneToMany(mappedBy = "stock")
	private List<Produit> produits;

	public Stock() {
		super();
	}

	public Stock(Long idStock, Integer qte, Integer qteMin, String libStock, List<Produit> produits) {
		super();
		this.idStock = idStock;
		this.qte = qte;
		this.qteMin = qteMin;
		this.libStock = libStock;
		this.produits = produits;
	}

	public Long getIdStock() {
		return idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public Integer getQteMin() {
		return qteMin;
	}

	public void setQteMin(Integer qteMin) {
		this.qteMin = qteMin;
	}

	public String getLibStock() {
		return libStock;
	}

	public void setLibStock(String libStock) {
		this.libStock = libStock;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
