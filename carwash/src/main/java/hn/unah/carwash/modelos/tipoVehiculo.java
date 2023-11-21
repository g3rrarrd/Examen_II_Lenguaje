package hn.unah.carwash.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipovehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class tipoVehiculo {
    
    @Id
    @Column(name = "idtipovehiculo")
    private int idtipovehiculos;
    
    private String descripcion;

    @Column(name = "precioxhora")
    private double precioXhora;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Vehiculos> idtipovehiculo;
}
