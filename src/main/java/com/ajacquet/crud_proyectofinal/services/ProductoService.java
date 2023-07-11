package com.ajacquet.crud_proyectofinal.services;

import com.ajacquet.crud_proyectofinal.models.Producto;
import org.springframework.stereotype.Service;


public interface ProductoService {
    void guardar();
    Iterable<Producto> listar();
}
