package io.github.danielbragga.domain.repositorio;

import io.github.danielbragga.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Clientes {
    private static String INSERT = "insert into cliente (nome) values (?)";


    @Autowired
    JdbcTemplate jdbcTemplate;

    public Cliente salvar(Cliente cliente){
        jdbcTemplate.update( INSERT, new Object[]{cliente.getNome()} );
        return cliente;

    }
}
