package br.com.ctrlman.repository;

import javax.persistence.Entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Entity
public interface OrdemServicoRepository extends CrudRepository<OrdemServicoRepository, Long>{
	
	

	}	
	


