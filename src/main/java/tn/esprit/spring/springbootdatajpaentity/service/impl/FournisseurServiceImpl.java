package tn.esprit.spring.springbootdatajpaentity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.springbootdatajpaentity.entity.Fournisseur;
import tn.esprit.spring.springbootdatajpaentity.repository.FournisseurRepository;
import tn.esprit.spring.springbootdatajpaentity.service.FournisseurService;

@Component
@Slf4j
public class FournisseurServiceImpl implements FournisseurService {

	@Autowired
	FournisseurRepository fournisseurRepository;

	@Override
	public Fournisseur retrieveFournisseutById(Long fournisseurId) {
		return fournisseurRepository.findById(fournisseurId).get();
	}

}
