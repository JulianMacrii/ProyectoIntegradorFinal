package com.ajacquet.crud_proyectofinal.services;

import com.ajacquet.crud_proyectofinal.models.Cliente;
import com.ajacquet.crud_proyectofinal.models.Producto;

public interface ClienteService {
    void guardarCliente(Cliente cliente);
    Iterable<Cliente> listarClientes();
    void eliminarClientePorId(Integer id);
    Cliente buscarClientePorId(Integer id);
    boolean actualizarCliente(Cliente cliente);
}
