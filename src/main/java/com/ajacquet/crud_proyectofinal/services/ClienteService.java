package com.ajacquet.crud_proyectofinal.services;

import com.ajacquet.crud_proyectofinal.models.Cliente;
import com.ajacquet.crud_proyectofinal.models.Producto;

import java.util.Optional;


public interface ClienteService {
    void guardar();
    Iterable<Cliente> listar();

    void eliminarPorId(Integer id);

    Optional<Cliente> buscarPorId(Integer id);

    Boolean actualizarCliente(Cliente cliente);


}
