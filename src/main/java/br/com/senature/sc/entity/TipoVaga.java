package br.com.senature.sc.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_vaga")
public class TipoVaga {
	
	@Id
	@SequenceGenerator(name = "tipo_vaga", sequenceName = "sq_tipo_vaga", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_vaga")
	@Column(name = "id_tipo_vaga")
	private int id;
	
	@Column(name = "nm_tipo_vaga")
	private String nome;
	
	@OneToMany(mappedBy = "tipo")
	private Collection<Vaga> vagas;

	public TipoVaga() {
		super();
	}

	public TipoVaga(int id, String nome, Collection<Vaga> vagas) {
		super();
		this.id = id;
		this.nome = nome;
		this.vagas = vagas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(Collection<Vaga> vagas) {
		this.vagas = vagas;
	}
	
}
