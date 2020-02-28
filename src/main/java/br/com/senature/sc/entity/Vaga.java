package br.com.senature.sc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vaga")
public class Vaga implements Serializable{

	@Id
	@SequenceGenerator(name = "vaga", sequenceName = "sq_vaga", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vaga")
	@Column(name = "id_vaga")
	private int id;
	
	@Column(name = "ds_vaga")
	private String descricao;
	
	@Column(name = "vl_diaria")
	private float valorDiaria;
	
	@Column(name = "ds_localizacao")
	private String localizacao;
	
	@JoinColumn(name = "id_tipo_vaga")
	@ManyToOne
	private TipoVaga tipo;
	
	@JoinColumn(name = "id_locatario")
	@ManyToOne
	private Locatario locatario;

	public Vaga() {
		super();
	}

	public Vaga(int id, String descricao, float valorDiaria, String localizacao, TipoVaga tipo, Locatario locatario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorDiaria = valorDiaria;
		this.localizacao = localizacao;
		this.tipo = tipo;
		this.locatario = locatario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public TipoVaga getTipo() {
		return tipo;
	}

	public void setTipo(TipoVaga tipo) {
		this.tipo = tipo;
	}

	public Locatario getLocatario() {
		return locatario;
	}

	public void setLocatario(Locatario locatario) {
		this.locatario = locatario;
	}

}
