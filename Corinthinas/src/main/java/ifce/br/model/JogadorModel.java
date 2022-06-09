package ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JogadorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String posicao;
	private Integer quantidadeDeGols;
	private Integer assistencias;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public Integer getQuantidadeDeGols() {
		return quantidadeDeGols;
	}
	public void setQuantidadeDeGols(Integer quantidadeDeGols) {
		this.quantidadeDeGols = quantidadeDeGols;
	}
	public Integer getAssistencias() {
		return assistencias;
	}
	public void setAssistencias(Integer assistencias) {
		this.assistencias = assistencias;
	}
	
	

}
