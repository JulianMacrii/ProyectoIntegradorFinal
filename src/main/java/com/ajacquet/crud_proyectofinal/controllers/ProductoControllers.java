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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductoControllers {

    //Autowired esta
    @Autowired
    @Qualifier("productoService")
    private ProductoService productoService;


    @RequestMapping("/addProducto")
    //Vamos a agregar la notacion de PathVariable que nos permitira tomar desde la url del navegador un valor.
    public ResponseEntity<String> addProducto(){

        productoService.guardar();

        return new ResponseEntity<>("guardado", HttpStatus.OK);
    }

    @GetMapping(value = "/agregar")
    public String agregarProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "agregar_producto";
    }

    @RequestMapping(value="/listarProductos", method= RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo", "Listado de Productos");
        model.addAttribute("productos", productoService.listar());
        return "listar";
    }

    /*Agregar un producto Nuevo*/

    /*Eliminar Producto byID*/
    @RequestMapping(value="/eliminarProducto", method= RequestMethod.GET)
    public String eliminar(Model model){
        model.addAttribute("titulo", "Listado de Productos");
        model.addAttribute("productos", productoService);
        return "productos/listar";
    }


}
