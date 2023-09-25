package br.com.alura.modelos;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity // importar configurações do BD
@Table(name= "produtos") // passar o nome da tabela quando for diferente do nome da classe
public class Produto {
    @Id // informar que o atributo "id" é a chave primária;
    @GeneratedValue (strategy = GenerationType.IDENTITY) // o valor da chave primária vai ser gerada pelo banco de dados
    private Long id;
    private  String nome;
    @Column(name = "desc") // Informar ao JPA que o nome da coluna no BD é diferente do nome do atributo.
    private String descricao;

    private BigDecimal preco;

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


