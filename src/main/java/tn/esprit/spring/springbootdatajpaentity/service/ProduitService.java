package tn.esprit.spring.springbootdatajpaentity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.springbootdatajpaentity.entity.Produit;

@Service
public interface ProduitService {

	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p, Long idRayon, Long idStock);

	Produit retrieveProduit(Long id);

	void assignFournisseurToProduit(Long fournisseurId, Long produitId);

	void assignProduitToStock(Long produitId, Long stockId);

}
