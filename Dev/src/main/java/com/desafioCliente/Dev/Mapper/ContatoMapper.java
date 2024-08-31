package com.desafioCliente.Dev.Mapper;

import com.desafioCliente.Dev.DTOS.ContatoDto;
import com.desafioCliente.Dev.Model.Contato;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContatoMapper {
    ContatoMapper INSTANCE = Mappers.getMapper(ContatoMapper.class);

    Contato toEntity(ContatoDto dto);
    ContatoDto toDto(Contato contato);
}