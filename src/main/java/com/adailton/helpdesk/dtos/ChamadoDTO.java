package com.adailton.helpdesk.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.adailton.helpdesk.domain.Chamado;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ChamadoDTO implements Serializable {


	private static final long serialVersionUID = 1L;

	private Integer id;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;
	
	@NotNull(message = "O campo PRIORIDADé requerido")
	private Integer prioridade;
	@NotNull(message = "O campo STATUS requerido")
	private Integer status;
	@NotNull(message = "O campo TITULO requerido")
	private String titulo;
	@NotNull(message = "O campo OBSERVACOES requerido")
	private String observacoes;
	@NotNull(message = "O campo TECNICO requerido")
	private Integer tecnico;
	@NotNull(message = "O campo CLEINTE requerido")
	private Integer cliente;
	private String nomeTecnico;
	private String nomeCliente;
	public ChamadoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChamadoDTO(Chamado obj) {
		this.id = obj.getId();
		this.dataAbertura = obj.getDataAbertura();
		this.dataFechamento = obj.getDataFechamento();
		this.prioridade = obj.getPrioridade().getCodigo();
		this.status = obj.getStatus().getCodigo();
		this.titulo = obj.getTitulo();
		this.observacoes = obj.getObservacoes();
		this.tecnico = obj.getTecnico().getId();
		this.cliente = obj.getCliente().getId();
		this.nomeCliente = obj.getCliente().getNome();
		this.nomeTecnico = obj.getTecnico().getNome();
	}
	
	
	
	

}
