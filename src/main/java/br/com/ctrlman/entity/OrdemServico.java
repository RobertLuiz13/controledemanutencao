package br.com.ctrlman.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

     
	@Table (name="ordemservico")
	@Entity(name="ordemservico")
	public class OrdemServico {
		
	@Autowired
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
     
   
	@Column(name = "")
	@JoinColumn(name = "cliente")
	private String cliente;
	
	@JoinColumn(name = "endereco")
	@Column(name = "endereco")
	private String endereco;
	
	@JoinColumn(name="email")
	@Column(name = "email")
	private String email;
	@Column(name = "")
	private String telefone ;
	@Column(name = "")
	private String TipoEquipamento;
	@Column(name = "")
	private String MarcaEquipamento;
	@Column(name = "")
	private String DescricaoDefeito;
	
	@DateTimeFormat(pattern =  "yyyy-MM-dd")
	private LocalDate dataEntrada;
	@DateTimeFormat(pattern =  "yyyy-MM-dd")
	private LocalDate dataSaida;
	
	public OrdemServico() {
		
	}
	public OrdemServico(String cliente, String endereco, String email, String telefone, String tipoEquipamento,
			String marcaEquipamento, String descricaoDefeito, LocalDate dataEntrada, LocalDate dataSaida) {
		super();
		this.cliente = cliente;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		TipoEquipamento = tipoEquipamento;
		MarcaEquipamento = marcaEquipamento;
		DescricaoDefeito = descricaoDefeito;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		
	}
	}

	


