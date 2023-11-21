package hn.unah.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.carwash.modelos.tipoCliente;

public interface tipoClienteRepository extends JpaRepository<tipoCliente, Integer> {
    
}
