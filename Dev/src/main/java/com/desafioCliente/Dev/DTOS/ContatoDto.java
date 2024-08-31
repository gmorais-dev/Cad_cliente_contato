package com.desafioCliente.Dev.DTOS;

import com.desafioCliente.Dev.Model.Cliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContatoDto {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private Cliente cliente;
}



