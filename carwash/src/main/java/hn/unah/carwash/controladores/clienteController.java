package hn.unah.carwash.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.carwash.modelos.cliente;
import hn.unah.carwash.servicios.Impl.clientesServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class clienteController {
    
    @Autowired
    private clientesServiceImpl clientesServiceImpl;

    @PostMapping("/crear")
    public cliente crearCliente(@RequestBody cliente cliente){
        return this.clientesServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/obtener")
    public List<cliente> obtener(){
        return this.clientesServiceImpl.obtenerClientes();
    }

    @GetMapping("/id")
    public cliente id(@RequestParam(name = "id") int id){
        return this.clientesServiceImpl.obtenerId(id);
    }

}
