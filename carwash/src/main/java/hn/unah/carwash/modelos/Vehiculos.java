package hn.unah.carwash.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculos {
    
    @ManyToOne
    @JoinColumn(name = "idtipovehiculo", referencedColumnName = "idtipovehiculo")
    private tipoVehiculo idtipovehiculo;

    private String marca;

    private int anio;

    private boolean disponible;

    @Id
    @Column(name = "idvehiculo")
    private int idVehiculo;

    public boolean isDisponible() {
        return disponible;
    }

    

}
