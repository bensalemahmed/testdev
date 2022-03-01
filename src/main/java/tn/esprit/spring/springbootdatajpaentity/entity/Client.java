package tn.esprit.spring.springbootdatajpaentity.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.spring.springbootdatajpaentity.enums.CategorieClient;
import tn.esprit.spring.springbootdatajpaentity.enums.Profession;

@Entity
@Data
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nom;
	private String prenom;

	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String email;
	private String password;

	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;

	@Enumerated(EnumType.STRING)
	private Profession profession;

	@OneToMany(mappedBy = "client")
	private List<Facture> listeFactures;

	public Client() {
		super();
	}

	public Client(Long idClient, String nom, String prenom, Date dateNaissance, String email, String password,
			CategorieClient categorieClient, Profession profession, List<Facture> listeFactures) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.password = password;
		this.categorieClient = categorieClient;
		this.profession = profession;
		this.listeFactures = listeFactures;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CategorieClient getCategorieClient() {
		return categorieClient;
	}

	public void setCategorieClient(CategorieClient categorieClient) {
		this.categorieClient = categorieClient;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public List<Facture> getListeFactures() {
		return listeFactures;
	}

	public void setListeFactures(List<Facture> listeFactures) {
		this.listeFactures = listeFactures;
	}

}
