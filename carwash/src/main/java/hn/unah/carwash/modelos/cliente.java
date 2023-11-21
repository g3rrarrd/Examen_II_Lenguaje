package hn.unah.carwash.modelos;

import java.time.LocalDate;

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
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class cliente {
    
    @Id
    @Column(name = "codigocliente")
    private int idCliente;

    private String nombre;

    private String apellido;

    @Column(name = "fechaingreso")
    private LocalDate fechaIngreso;

    @ManyToOne
    @JoinColumn(name = "idtipocliente", referencedColumnName = "idtipocliente")
    private tipoCliente idtipocliente;

}
