package com.ajacquet.crud_proyectofinal.controllers;
import com.ajacquet.crud_proyectofinal.models.Cliente;
import com.ajacquet.crud_proyectofinal.services.ClienteService;
import org.springframework.stereotype.Controller;
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

@Controller
public class ClienteControllers {

    @Autowired
    @Qualifier("clienteService")
    private ClienteService clienteService;

    @RequestMapping("/addCliente")
    public ResponseEntity<String> addCliente(){
        Cliente cliente = new Cliente();
        cliente.setNombre("Nombre del Cliente");
        cliente.setApellido("Apellido del Cliente");
        cliente.setDni("12345678");
        cliente.setEmail("cliente@ejemplo.com");
        clienteService.guardarCliente(cliente);
        return new ResponseEntity<>("guardado", HttpStatus.OK);
    }

    @RequestMapping(value="/listarClientes", method=RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo", "Listado de Clientes");
        model.addAttribute("clientes", clienteService.listarClientes());
        return "listar_clientes";
    }

    @RequestMapping(value="/eliminarCliente", method=RequestMethod.GET)
    public String eliminar(Model model){
        model.addAttribute("titulo", "Listado de Clientes");
        model.addAttribute("clientes", clienteService.listarClientes());
        return "listar_clientes";
    }
}
