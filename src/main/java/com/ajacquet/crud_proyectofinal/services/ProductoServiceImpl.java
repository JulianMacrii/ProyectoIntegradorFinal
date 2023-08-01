package com.ajacquet.crud_proyectofinal.services;

import com.ajacquet.crud_proyectofinal.models.Producto;
import com.ajacquet.crud_proyectofinal.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("productoService")
public class ProductoServiceImpl implements ProductoService { // La clase ProductoServiceImpl implementa la interfaz ProductoService
    @Autowired
    private ProductoRepository productoRepository;


    @Override
    public void guardar() {
        Producto producto1 = new Producto();
        producto1.setNombre("Moto Honda XR 250");
        producto1.setPrecio(49000.0);
        productoRepository.save(producto1);
    }

    @Override
    public Iterable<Producto> listar() {
        return productoRepository.findAll();
    }

    @Override
<<<<<<< HEAD
    public void eliminarPorById(Integer id) {
        productoRepository.deleteById(id);

=======
    public void eliminarPorId(Integer id) {
        productoRepository.deleteById(id);
>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0
    }

    @Override
    public Optional<Producto> buscarPorId(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public Boolean actualizarProducto(Producto producto) {
        return null;
    }

    @Override
    public Boolean actualizarPrecioProducto(Integer idProducto, Double precioActualizado) {
        return null;
    }


}
//El método listar() se encuentra en la clase ProductoServiceImpl,
// que es una implementación del servicio ProductoService.
// La clase ProductoServiceImpl está anotada con @Service,
// lo que indica que es un componente de servicio de Spring que se encarga de la lógica relacionada con los productos.

//En resumen, este código define una implementación del servicio ProductoService llamada ProductoServiceImpl,
// que utiliza el repositorio ProductoRepository para realizar operaciones de persistencia en la base de datos.
// El servicio contiene métodos para guardar un producto y obtener una lista de todos los productos almacenados
// en la base de datos.