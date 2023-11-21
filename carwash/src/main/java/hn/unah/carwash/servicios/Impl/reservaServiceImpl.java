package hn.unah.carwash.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.carwash.modelos.Reserva;
import hn.unah.carwash.modelos.Vehiculos;
import hn.unah.carwash.modelos.cliente;
import hn.unah.carwash.repositorios.clientesRepository;
import hn.unah.carwash.repositorios.reservaRepository;
import hn.unah.carwash.repositorios.vehiculoRepository;
import hn.unah.carwash.servicios.reservaService;

@Service
public class reservaServiceImpl implements reservaService{

    @Autowired
    private reservaRepository reservaRepository;
    @Autowired
    private clientesRepository clientesRepository;
    @Autowired
    private vehiculoRepository vehiculoRepository;

    @Override
    public String crearReserva(Reserva reserva) {
        
        if(reserva != null){

            cliente cliente = this.clientesRepository.findById(reserva.getIdCliente()).get();
            Vehiculos vehiculo = this.vehiculoRepository.findById(reserva.getIdVehiculo()).get();

            if(vehiculo.isDisponible() == false){
                return "el vehiculo ya se encuentra rentado";
            }

            vehiculo.setDisponible(false);
            reserva.setTotal(vehiculo.getIdtipovehiculo().getPrecioXhora() * reserva.getDias());

            this.reservaRepository.save(reserva);

            return "vehiculo rentado con exito";
        }

        return null;
    }
    
}
