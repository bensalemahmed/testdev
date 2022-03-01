package tn.esprit.spring.springbootdatajpaentity.repository;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootdatajpaentity.entity.Client;
import tn.esprit.spring.springbootdatajpaentity.enums.CategorieClient;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

	@Query("SELECT c FROM Client c where c.dateNaissance BETWEEN :dateMin AND :dateMax")
	public Collection<Client> getClientByBirthDateIn(@Param("dateMin") Date dateMin, @Param("dateMax") Date dateMax);

	@Query("SELECT SUM(f.montantFacture) from Facture f join f.client c  where c.categorieClient = :category and f.dateFacture between :dateMin and :dateMax")
	public float getChiffreAffaireParCategorieClient(@Param("category") CategorieClient categorieClient,
			@Param("dateMin") Date startDate, @Param("dateMax") Date endDate);
}
