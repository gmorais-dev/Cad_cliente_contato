package com.desafioCliente.Dev.ClienteController;


import com.desafioCliente.Dev.DTOS.ClienteDto; // Supondo que você tenha um ClienteDto
import com.desafioCliente.Dev.Model.Cliente;
import com.desafioCliente.Dev.Services.ClienteService;
import com.desafioCliente.Dev.Services.ContatoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;
    private final ContatoService contatoService;

    public ClienteController(ClienteService clienteService, ContatoService contatoService) {
        this.clienteService = clienteService;
        this.contatoService = contatoService;
    }

    @PostMapping
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody ClienteDto clienteDto) {
        Cliente cliente = clienteService.saveCliente(clienteDto);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }
}