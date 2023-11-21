package hn.unah.carwash.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.carwash.modelos.tipoCliente;
import hn.unah.carwash.repositorios.tipoClienteRepository;
import hn.unah.carwash.servicios.tipoClienteService;

@Service
public class tipoClienteServiceImpl implements tipoClienteService{

    @Autowired
    private tipoClienteRepository tipoClienteRepository;

    @Override
    public tipoCliente crearTipoCliente(tipoCliente tipoCliente) {
        
        if(tipoCliente != null){
            return this.tipoClienteRepository.save(tipoCliente);
        }

        return null;
    }
    
}
