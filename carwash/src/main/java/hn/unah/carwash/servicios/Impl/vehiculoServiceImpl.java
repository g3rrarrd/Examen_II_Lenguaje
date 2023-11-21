package hn.unah.carwash.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.carwash.modelos.Vehiculos;
import hn.unah.carwash.repositorios.vehiculoRepository;
import hn.unah.carwash.servicios.vehiculoService;

@Service
public class vehiculoServiceImpl implements vehiculoService{

    @Autowired
    private vehiculoRepository vehiculoRepository;

    @Override
    public Vehiculos crearVehiculos(Vehiculos vehiculos){
        
        if(vehiculos != null){

            return this.vehiculoRepository.save(vehiculos);

        }

        return null;

    }

    @Override
    public List<Vehiculos> obtenerVehiculos() {
        
        if(this.vehiculoRepository.findAll() != null){
            return this.vehiculoRepository.findAll();
        }

        return null;
    }

    @Override
    public Vehiculos obtenerId(int id) {
       
        if(this.vehiculoRepository.findById(id).get() != null){
            return this.vehiculoRepository.findById(id).get();
        }

        return null;
    }
   
    
}
