package tn.esprit.spring.springbootdatajpaentity.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootdatajpaentity.entity.Facture;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long>{

	@Modifying
	@Query(value ="UPDATE Facture set active=0 WHERE id_facture=?1")
	void cancelFacture(Long id);
	

}
