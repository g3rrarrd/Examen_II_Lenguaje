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
@Table(name = "tipocliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class tipoCliente{
    
    @Id
    @Column(name = "idtipocliente")
    private int idTipoCliente;

    private String descripcion;

    @OneToMany(cascade = CascadeType.ALL)
    private List<cliente> idtipocliente;
}
