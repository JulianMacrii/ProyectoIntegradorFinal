package com.ajacquet.crud_proyectofinal.services;

import com.ajacquet.crud_proyectofinal.models.Cliente;
import com.ajacquet.crud_proyectofinal.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("clienteService")
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public void guardar() {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan");
        cliente1.setApellido("Quintero");
        cliente1.setDni("34353535");
        cliente1.setEmail("juanquintero@gmail.com");
        clienteRepository.save(cliente1);
    }

    @Override
    public Iterable<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public void eliminarPorId(Integer id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Optional<Cliente> buscarPorId(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Boolean actualizarCliente(Cliente producto) {
        return null;
    }

}
