package org.ejemplo.EasyCar.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Views({
        @View(name = "Simple", members = "idCliente, nombre, apellido")
})
public class Cliente {
    @Id
    @Column(length = 6)
    int idCliente;

    @Column(length = 50)
    @Required
    String nombre;

    @Column(length = 50)
    @Required
    String apellido;

    @Column(length = 50)
    @Required
    String correo;

    @Column(length = 50)
    @Required
    String direccion;

    @Column(length = 10)
    @Required
    String telefono;

    @OneToMany(mappedBy = "cliente")
    @ListProperties("id_cita, fecha, estado")
    List<Cita> citas;
}