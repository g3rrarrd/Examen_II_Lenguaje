package hn.unah.carwash.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.carwash.modelos.tipoVehiculo;
import hn.unah.carwash.servicios.Impl.tipoClienteServiceImpl;
import hn.unah.carwash.servicios.Impl.tipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipoV")
public class tipoVehiduloController {
    
    @Autowired
    private tipoVehiculoServiceImpl tipoVehiculoServiceImpl;


    @PostMapping("/crear")
    public tipoVehiculo crearTipoVehiculo(@RequestBody tipoVehiculo tipoVehiculo){
        return this.tipoVehiculoServiceImpl.crearTipoVehidulo(tipoVehiculo);
    }
}
