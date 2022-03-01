package tn.esprit.spring.springbootdatajpaentity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.springbootdatajpaentity.entity.Client;
import tn.esprit.spring.springbootdatajpaentity.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	ClientService clientService;

	@GetMapping("/retrieve-all-clients")
	@ResponseBody
	public List<Client> getClients() {
		List<Client> listClients = clientService.retrieveAllClients();
		return listClients;
	}

	@GetMapping("/retrieve-client/{client-id}")
	@ResponseBody
	public Client retrieveClient(@PathVariable("client-id") Long clientId) {
		return clientService.retrieveClient(clientId);
	}

	
	@DeleteMapping("/remove-client/{client-id}")
	@ResponseBody
	public void removeClient(@PathVariable("client-id") Long clientId) {
		clientService.deleteClient(clientId);
	}
	
	@PostMapping("/add-client")
	@ResponseBody
	public Client addClient(@RequestBody Client c) {
		Client client = clientService.addClient(c);
		return client;
	}

	@PutMapping("/modify-client")
	@ResponseBody
	public Client modifyClient(@RequestBody Client client) {
		return clientService.updateClient(client);
	}
}
