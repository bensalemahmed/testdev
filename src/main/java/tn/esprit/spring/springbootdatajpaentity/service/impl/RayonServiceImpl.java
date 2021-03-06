package tn.esprit.spring.springbootdatajpaentity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.springbootdatajpaentity.entity.Rayon;
import tn.esprit.spring.springbootdatajpaentity.repository.RayonRepository;
import tn.esprit.spring.springbootdatajpaentity.service.RayonService;

@Component
@Slf4j
public class RayonServiceImpl implements RayonService{
	
	@Autowired
	RayonRepository rayonRepository;

	@Override
	public Rayon getRayonById(Long id) {
		return rayonRepository.findById(id).orElse(null);
	}

}
