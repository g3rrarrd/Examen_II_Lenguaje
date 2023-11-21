package hn.unah.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.carwash.modelos.cliente;

public interface clientesRepository extends JpaRepository<cliente, Integer>{
    
}
