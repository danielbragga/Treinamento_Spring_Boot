package io.github.danielbragga;

import io.github.danielbragga.domain.entity.Cliente;
import io.github.danielbragga.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.DayOfWeek;
import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return  args -> {
            Cliente cliente = new Cliente();
            cliente.setNome("Daniel");
            clientes.salvar(cliente);
        };

    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }

}
