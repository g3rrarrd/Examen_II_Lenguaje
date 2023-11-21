package hn.unah.carwash.servicios;

import java.util.List;

import hn.unah.carwash.modelos.cliente;

public interface clientesService {
    
    public cliente crearCliente(cliente cliente);

    public List<cliente> obtenerClientes();

    public cliente obtenerId(int id);
}
