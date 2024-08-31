package com.desafioCliente.Dev.ClienteController;

package com.desafioCliente.Dev.Services;

import com.desafioCliente.Dev.DTOS.ClienteDto;
import com.desafioCliente.Dev.DTOS.ContatoDto;
import com.desafioCliente.Dev.Mapper.ClienteMapper;
import com.desafioCliente.Dev.Model.Cliente;
import com.desafioCliente.Dev.Model.Contato;
import com.desafioCliente.Dev.Repository.ClienteRepository;
import com.desafioCliente.Dev.Repository.ContatoRepository;
import com.desafioCliente.Dev.Services.ContatoService;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteMapper clienteMapper = ClienteMapper.INSTANCE;
    private final ClienteRepository clienteRepository;
    private final ContatoService contatoService;

    public ClienteService(ClienteRepository clienteRepository, ContatoService contatoService) {
        this.clienteRepository = clienteRepository;
        this.contatoService = contatoService;
    }

    public Cliente saveCliente(ClienteDto clienteDto) {
        Cliente cliente = clienteMapper.toEntity(clienteDto);
        cliente = clienteRepository.save(cliente);

        // Salva os contatos vinculados ao cliente
        for (ContatoDto contatoDto : clienteDto.getContatos()) {
            contatoDto.setCliente(cliente); // Vincula o cliente ao contato
            contatoService.SalvaMapperDto(contatoDto); // Salva cada contato
        }

        return cliente;
    }
}
