package br.com.mfurtado.hamburgueria.domain.dao;

import br.com.mfurtado.hamburgueria.domain.model.Contato;
import br.com.mfurtado.hamburgueria.domain.qualifier.UnitedBurgerQualifier;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class ContatoDao {
    @Inject
    @UnitedBurgerQualifier
 private EntityManager em;

    public void cadastrar(Contato contato) {
        try {
            em.getTransaction().begin();
            em.persist(contato);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();

            e.printStackTrace();

            throw new RuntimeException("Erro ao realizar cadastro do contato");
        }
    }
}