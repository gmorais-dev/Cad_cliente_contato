package com.desafioCliente.Dev.Repository;

import com.desafioCliente.Dev.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}