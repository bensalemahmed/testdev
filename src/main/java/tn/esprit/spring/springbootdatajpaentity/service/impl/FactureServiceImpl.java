package tn.esprit.spring.springbootdatajpaentity.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.springbootdatajpaentity.entity.Facture;
import tn.esprit.spring.springbootdatajpaentity.repository.FactureRepository;
import tn.esprit.spring.springbootdatajpaentity.service.FactureService;

@Component
@Slf4j
public class FactureServiceImpl implements FactureService {

	@Autowired
	FactureRepository factureRepository;

	@Override
	public List<Facture> retrieveAllFactures() {
		return StreamSupport.stream(factureRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public void cancelFacture(Long id) {
		factureRepository.cancelFacture(id);

	}

	@Override
	public Facture retrieveFacture(Long id) {
		return factureRepository.findById(id).orElse(null);
	}

	@Override
	public List<Facture> getFacturesByClient(Long idClient) {
		// TODO Auto-generated method stub
		return null;
	}

}
