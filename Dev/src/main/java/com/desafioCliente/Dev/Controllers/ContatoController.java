package com.desafioCliente.Dev.ClienteController;

import com.desafioCliente.Dev.Services.ClienteService;
import com.desafioCliente.Dev.Services.ContatoService;

public class ContatoController {

    private final ContatoService clienteService;
    private final ContatoService contatoService;

    public ClienteController(ClienteService clienteService, ContatoService contatoService) {
        this.clienteService = clienteService;
        this.contatoService = contatoService;
    }
}
