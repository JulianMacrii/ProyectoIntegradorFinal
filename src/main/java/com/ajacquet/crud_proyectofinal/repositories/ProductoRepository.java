package com.ajacquet.crud_proyectofinal.repositories;

import com.ajacquet.crud_proyectofinal.models.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto,Integer> {
 // esta interfaz hereda métodos predefinidos
    // para realizar operaciones CRUD (Crear, Leer, Actualizar y Borrar) en la entidad Producto en la base de datos.

}
