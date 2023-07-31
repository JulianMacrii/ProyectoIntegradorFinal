package com.ajacquet.crud_proyectofinal.controllers;

import com.ajacquet.crud_proyectofinal.models.Cliente;
import com.ajacquet.crud_proyectofinal.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteControllers {
    //Autowired esta
    @Autowired
    @Qualifier("clienteService")
    private ClienteService clienteService;


    @RequestMapping("/addCliente")
    //Vamos a agregar la notacion de PathVariable que nos permitira tomar desde la url del navegador un valor.
    public ResponseEntity<String> addCliente(){

        clienteService.guardar();

        return new ResponseEntity<>("guardado", HttpStatus.OK);
    }

    @GetMapping(value = "/agregarCliente")
    public String agregarCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientes/agregar_cliente";
    }

    @RequestMapping(value="/listarClientes", method= RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo", "Listado de Clientes");
        model.addAttribute("clientes", clienteService.listar());
        return "clientes/listarClientes";
    }

}
