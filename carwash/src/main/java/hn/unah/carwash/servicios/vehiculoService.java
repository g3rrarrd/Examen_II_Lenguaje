package hn.unah.carwash.servicios;

import java.util.List;

import hn.unah.carwash.modelos.Vehiculos;

public interface vehiculoService {
    
    public Vehiculos crearVehiculos(Vehiculos vehiculos);

    public List<Vehiculos> obtenerVehiculos();

    public Vehiculos obtenerId(int id);
}
