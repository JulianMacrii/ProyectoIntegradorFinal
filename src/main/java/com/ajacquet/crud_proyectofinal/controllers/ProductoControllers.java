package com.ajacquet.crud_proyectofinal.controllers;

import com.ajacquet.crud_proyectofinal.models.Producto;
import com.ajacquet.crud_proyectofinal.repositories.ProductoRepository;
import com.ajacquet.crud_proyectofinal.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // maneja las peticiones relacionadas con productos en nuestra aplicación.
public class ProductoControllers {

    //Autowired realiza la inyección de dependencias automáticamente - ProductoService
    @Autowired
    @Qualifier("productoService")
    private ProductoService productoService;


    @RequestMapping("/addProducto")                                         //asociar una URL o ruta específica a este método en el controlador.

    public ResponseEntity<String> addProducto(){                            // representa una respuesta HTTP del tipo string
        productoService.guardar();
        return new ResponseEntity<>("guardado", HttpStatus.OK);
    }

    @RequestMapping(value="/listarProductos", method= RequestMethod.GET)    //este método debe responder solo a solicitudes HTTP GET utilizando method = RequestMethod.GET.
    public String listar(Model model){
        //El objeto Model es utilizado para pasar datos desde el controlador a la vista.
        model.addAttribute("titulo", "Listado de Productos");
        model.addAttribute("productos", productoService.listar());
        return "listar";
    }

    /*Agregar un producto Nuevo*/

    /*Eliminar Producto byID*/
    @RequestMapping(value="/eliminarProducto", method= RequestMethod.GET)
    public String eliminar(Model model){
        model.addAttribute("titulo", "Listado de Productos");
        model.addAttribute("productos", productoService.listar());
        return "listar";
    }


}
