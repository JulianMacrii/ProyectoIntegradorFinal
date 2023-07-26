package com.ajacquet.crud_proyectofinal.services;

import com.ajacquet.crud_proyectofinal.models.Producto;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface ProductoService {
    void guardar();
    Iterable<Producto> listar();

    void eliminarPorId(Integer id);

    Optional<Producto> buscarPorId(Integer id);

    Boolean actualizarProducto(Producto producto);

    Boolean actualizarPrecioProducto(Integer idProducto, Double precioActualizado);

}
