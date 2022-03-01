package tn.esprit.spring.springbootdatajpaentity.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	private float montantRemise;
	private float montantFacture;
	
	@Temporal(TemporalType.TIME)
	private Date dateFacture;
	
	private Boolean active;
	
	@ManyToOne
	private Client client;
	
	@OneToMany(mappedBy = "facture")
	private List<DetailFacture> detailFactures;

	public Facture() {
		super();
	}

	public Facture(Long idFacture, float montantRemise, float montantFacture, Date dateFacture, Boolean active,
			Client client, List<DetailFacture> detailFactures) {
		super();
		this.idFacture = idFacture;
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.active = active;
		this.client = client;
		this.detailFactures = detailFactures;
	}

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public float getMontantFacture() {
		return montantFacture;
	}

	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<DetailFacture> getDetailFactures() {
		return detailFactures;
	}

	public void setDetailFactures(List<DetailFacture> detailFactures) {
		this.detailFactures = detailFactures;
	}

}
