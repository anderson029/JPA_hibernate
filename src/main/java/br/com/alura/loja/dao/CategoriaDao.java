package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Categoria;

import javax.persistence.EntityManager;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }
    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);
    }

    public void atualizar (Categoria categoria){
        this.em.merge(categoria);
    }
    public void remover(Categoria categoria) {
        categoria = em.merge(categoria);// reatribuir a entidade para garantir que volte ao estado MANAGED, assim é possível remover o objeto
        this.em.remove(categoria);
    }
}