package com.ajacquet.crud_proyectofinal.services;

import com.ajacquet.crud_proyectofinal.models.Cliente;
import com.ajacquet.crud_proyectofinal.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======
import java.util.Optional;

>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0
@Service
@Qualifier("clienteService")
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

<<<<<<< HEAD
    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public Iterable<Cliente> listarClientes() {
=======

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
>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0
        return clienteRepository.findAll();
    }

    @Override
<<<<<<< HEAD
    public void eliminarClientePorId(Integer id) {
=======
    public void eliminarPorId(Integer id) {
>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0
        clienteRepository.deleteById(id);
    }

    @Override
<<<<<<< HEAD
    public Cliente buscarClientePorId(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) {
        if (cliente.getId() != null && clienteRepository.existsById(cliente.getId())) {
            clienteRepository.save(cliente);
            return true;
        }
        return false;
    }
}
=======
    public Optional<Cliente> buscarPorId(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Boolean actualizarCliente(Cliente producto) {
        return null;
    }

}
>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0
