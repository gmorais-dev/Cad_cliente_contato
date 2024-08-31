package com.desafioCliente.Dev.DTOS;

import com.desafioCliente.Dev.Model.Cliente;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Contato {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private Cliente cliente;


}




