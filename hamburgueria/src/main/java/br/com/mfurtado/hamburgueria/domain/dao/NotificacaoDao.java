package br.com.mfurtado.hamburgueria.domain.dao;

import br.com.mfurtado.hamburgueria.domain.model.Notificacao;
import br.com.mfurtado.hamburgueria.domain.qualifier.ParceriasQualifier;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class NotificacaoDao {
    @Inject
    @ParceriasQualifier
    private EntityManager em;

    public void cadastrar(Notificacao notificacao) {

        try {
            em.getTransaction().begin();
            em.persist(notificacao);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();

            e.printStackTrace();

            throw new RuntimeException("Erro ao realizar cadastro da notificacao");
        }
    }
}