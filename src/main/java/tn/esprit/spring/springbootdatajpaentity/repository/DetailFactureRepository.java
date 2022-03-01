package tn.esprit.spring.springbootdatajpaentity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootdatajpaentity.entity.DetailFacture;

@Repository
public interface DetailFactureRepository extends CrudRepository<DetailFacture, Long>{

}
