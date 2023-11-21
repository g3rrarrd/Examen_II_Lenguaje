package hn.unah.carwash.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.carwash.modelos.tipoCliente;
import hn.unah.carwash.servicios.Impl.tipoClienteServiceImpl;

@RestController
@RequestMapping("/api/tipoC")
public class tipoClienteController {
    
    @Autowired
    private tipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public tipoCliente crearTipoCliente(@RequestBody tipoCliente tipoCliente){
        return this.tipoClienteServiceImpl.crearTipoCliente(tipoCliente);
    }

}
