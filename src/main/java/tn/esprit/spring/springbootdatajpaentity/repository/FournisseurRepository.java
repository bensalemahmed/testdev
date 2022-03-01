package tn.esprit.spring.springbootdatajpaentity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootdatajpaentity.entity.Fournisseur;

@Repository
public interface FournisseurRepository extends CrudRepository<Fournisseur, Long>{

}
