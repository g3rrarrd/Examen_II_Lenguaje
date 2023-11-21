package hn.unah.carwash.modelos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reserva")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    
    @Id
    @Column(name = "idreserva")
    private int idReserva;

    @Column(name = "idcliente")
    private int idCliente;

    @Column(name = "idvehiculo")
    private int idVehiculo;

    private LocalDate fecha;

    private int dias;

    private double total;
}
