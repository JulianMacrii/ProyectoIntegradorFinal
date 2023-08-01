package com.ajacquet.crud_proyectofinal.services;

import com.ajacquet.crud_proyectofinal.models.Cliente;
import com.ajacquet.crud_proyectofinal.models.Producto;

<<<<<<< HEAD
public interface ClienteService {
    void guardarCliente(Cliente cliente);
    Iterable<Cliente> listarClientes();
    void eliminarClientePorId(Integer id);
    Cliente buscarClientePorId(Integer id);
    boolean actualizarCliente(Cliente cliente);
=======
import java.util.Optional;


public interface ClienteService {
    void guardar();
    Iterable<Cliente> listar();

    void eliminarPorId(Integer id);

    Optional<Cliente> buscarPorId(Integer id);

    Boolean actualizarCliente(Cliente cliente);


>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0
}
