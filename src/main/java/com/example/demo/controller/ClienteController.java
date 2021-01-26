package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ClienteRepository;
import com.example.demo.Model.Cliente;
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository  ClienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return ClienteRepository.findAll();


	}
	@PostMapping
	@ResponseStatus
	
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return ClienteRepository.save(cliente);
	}
}

