package br.com.ctrlman.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import br.com.ctrlman.entity.ConsultaOs;


@Service
@RestController("/index")
public interface ConsultaOsRepository extends CrudRepository<ConsultaOs, Long>{

}
