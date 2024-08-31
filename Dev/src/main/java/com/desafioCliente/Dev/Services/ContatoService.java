package com.desafioCliente.Dev.Services;

import com.desafioCliente.Dev.DTOS.ContatoDto;
import com.desafioCliente.Dev.Mapper.ContatoMapper;
import com.desafioCliente.Dev.Model.Cliente;
import com.desafioCliente.Dev.Model.Contato;

public class ContatoService {
    private final ContatoMapper mapper = ContatoMapper.INSTANCE;

    public void SalvaMapperDto() {
        ContatoDto dto = new ContatoDto();
        Contato contato = mapper.toEntity(dto);

    }
    
}
