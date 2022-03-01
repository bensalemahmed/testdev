package tn.esprit.spring.springbootdatajpaentity.service;

import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootdatajpaentity.entity.Fournisseur;

@Service
public interface FournisseurService {
	
	Fournisseur retrieveFournisseutById(Long fournisseurId);

}
