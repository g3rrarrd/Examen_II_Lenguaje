package hn.unah.carwash.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.carwash.modelos.Vehiculos;
import hn.unah.carwash.servicios.Impl.vehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculo")
public class vehiculoController {
    
    @Autowired
    private vehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculos crearVehiculos(@RequestBody Vehiculos vehiculos){
        return this.vehiculoServiceImpl.crearVehiculos(vehiculos);
    }

    @GetMapping("/obtener")
    public List<Vehiculos> obtener(){
        return this.vehiculoServiceImpl.obtenerVehiculos();
    }

    @GetMapping("/id")
    public Vehiculos id(@RequestParam(name = "id") int id){
        return this.vehiculoServiceImpl.obtenerId(id);
    }

}
