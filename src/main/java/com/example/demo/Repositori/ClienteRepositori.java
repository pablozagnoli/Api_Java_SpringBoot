package com.example.demo.Repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Cliente;

@Repository
public interface ClienteRepositori extends JpaRepository<Cliente ,Long> {

	
	
}
