package com.ajacquet.crud_proyectofinal.services;

import com.ajacquet.crud_proyectofinal.models.Producto;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface ProductoService {
    void guardar();
    Iterable<Producto> listar();

<<<<<<< HEAD
    void eliminarPorById(Integer id);

    Optional <Producto> buscarPorId(Integer id);
=======
    void eliminarPorId(Integer id);

    Optional<Producto> buscarPorId(Integer id);
>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0

    Boolean actualizarProducto(Producto producto);

    Boolean actualizarPrecioProducto(Integer idProducto, Double precioActualizado);

}
