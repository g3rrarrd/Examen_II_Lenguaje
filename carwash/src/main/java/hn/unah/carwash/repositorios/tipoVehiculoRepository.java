package hn.unah.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.carwash.modelos.tipoVehiculo;

public interface tipoVehiculoRepository extends JpaRepository<tipoVehiculo, Integer>{
    
}
