package hn.unah.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.carwash.modelos.Reserva;

public interface reservaRepository extends JpaRepository<Reserva, Integer>{
    
}
