package hn.unah.carwash.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.carwash.modelos.tipoVehiculo;
import hn.unah.carwash.repositorios.tipoVehiculoRepository;
import hn.unah.carwash.servicios.tipoVehiculoService;

@Service
public class tipoVehiculoServiceImpl implements tipoVehiculoService{

    @Autowired
    private tipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public tipoVehiculo crearTipoVehidulo(tipoVehiculo tipoVehiculo) {
        
        if(tipoVehiculo != null){
            return this.tipoVehiculoRepository.save(tipoVehiculo);
        }

        return null;

    }
    
}
