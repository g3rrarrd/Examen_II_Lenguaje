package hn.unah.carwash.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.carwash.modelos.cliente;
import hn.unah.carwash.repositorios.clientesRepository;
import hn.unah.carwash.servicios.clientesService;

@Service
public class clientesServiceImpl implements clientesService{

    @Autowired
    private clientesRepository clientesRepository;

    @Override
    public cliente crearCliente(cliente cliente) {
       
        if(cliente != null){
            return this.clientesRepository.save(cliente);
        }

        return null;
    }

    @Override
    public List<cliente> obtenerClientes() {
        
        if(this.clientesRepository.findAll() != null){
            return this.clientesRepository.findAll();
        }

        return null;

    }

    @Override
    public cliente obtenerId(int id) {
        
        if(this.clientesRepository.findById(id).get() != null){
            return this.clientesRepository.findById(id).get();
        }

        return null;
    }
    
}
