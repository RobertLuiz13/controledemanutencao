package br.com.ctrlman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Table(name = "consultaos")
@Entity(name = "consultaos")
public class ConsultaOs {
     
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
    
	@Autowired
	@JoinColumn(name = "nome")
	@Column(name = "nome")
	private String cliente;
	
  
	@JoinColumn(name = "endereco")
	@Column(name = "endereco")
	private String endereco;
   
	@JoinColumn(name = "telefone")
	@Column(name = "telefone")
	private String telefone;

	@JoinColumn(name = "email")
	@Column(name="email")
	private String email;
	
 
	@JoinColumn(name = "num_os")
	@Column(name="num_=s")
	private String NumOs;
	
    public ConsultaOs consultaOs () {
		return consultaOs();}
	public ConsultaOs(String cliente, String endereco,String telefone,String email,String NumOs){
		this.cliente = cliente;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email=email;
		this.NumOs=NumOs;
	}

}