package br.com.mfurtado.hamburgueria.service;

import br.com.mfurtado.hamburgueria.domain.dao.NotificacaoDao;
import br.com.mfurtado.hamburgueria.domain.model.Notificacao;

import javax.inject.Inject;


public class NotificacaoService {


    @Inject
    private NotificacaoDao notificacaoDao;

    public void cadastrar(Notificacao notificacao) {
        notificacaoDao.cadastrar(notificacao);
    }
}