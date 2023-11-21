package hn.unah.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.carwash.modelos.Vehiculos;

public interface vehiculoRepository extends JpaRepository<Vehiculos, Integer>{
    
}
