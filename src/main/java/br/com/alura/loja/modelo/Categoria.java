package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity // importar configurações do BD
@Table(name = "categorias") // passar o nome da tabela quando for diferente do nome da classe
public class Categoria {

    @Id // informar que o atributo "id" é a chave primária;
    @GeneratedValue(strategy = GenerationType.IDENTITY) // o valor da chave primária vai ser gerada pelo banco de dados
    private Long id;
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
