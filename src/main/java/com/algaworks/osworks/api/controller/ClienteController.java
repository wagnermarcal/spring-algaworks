package com.algaworks.osworks.api.controller;

import com.algaworks.osworks.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Wagner");
        cliente1.setEmail("wagnermarcal@hotmail.com");
        cliente1.setTelefone("41 - 9 9948-6471");
        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Luis");
        cliente2.setEmail("luismarcal_2009@hotmail.com");
        cliente2.setTelefone("41 - 9 9620-1995");

        return Arrays.asList(cliente1, cliente2);
    }
}
