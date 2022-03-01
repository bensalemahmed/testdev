package tn.esprit.spring.springbootdatajpaentity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootdatajpaentity.entity.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
