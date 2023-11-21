package hn.unah.carwash.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.carwash.modelos.Reserva;
import hn.unah.carwash.servicios.Impl.reservaServiceImpl;

@RestController
@RequestMapping("/api/reserva")
public class reservaController {
    
    @Autowired
    private reservaServiceImpl reservaServiceImpl;

    @PostMapping("/crear")
    public String crearReserva(@RequestBody Reserva reserva){
        return this.reservaServiceImpl.crearReserva(reserva);
    }

}
