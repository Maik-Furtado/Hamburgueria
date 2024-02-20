package br.com.mfurtado.hamburgueria.service;

import br.com.mfurtado.hamburgueria.domain.dao.ContatoDao;
import br.com.mfurtado.hamburgueria.domain.model.Contato;

import javax.inject.Inject;

public class ContatoService {

    @Inject
    private ContatoDao contatoDao;

    public void cadastrar(Contato contato) {
        contatoDao.cadastrar(contato);
    }
}