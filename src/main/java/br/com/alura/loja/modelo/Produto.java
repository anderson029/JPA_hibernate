package br.com.alura.loja.modelo;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity // importar configurações do BD
@Table(name = "produtos") // passar o nome da tabela quando for diferente do nome da classe
public class Produto {

	@Id // informar que o atributo "id" é a chave primária;
	@GeneratedValue(strategy = GenerationType.IDENTITY)// o valor da chave primária vai ser gerada pelo banco de dados
	private Long id;
	private String nome;
	/* @Column(name = "desc") Informar ao JPA que o nome da coluna no BD é diferente do nome do atributo.*/
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCadastro = LocalDate.now();

	public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
