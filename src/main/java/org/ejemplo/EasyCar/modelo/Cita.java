package org.ejemplo.EasyCar.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReferenceView;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cita {

    @Id
    @Column(name = "id_cita")
    int id_cita;

    @Column(length = 50)
    String fecha;

    @Column(length = 50)
    String estado;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    @ReferenceView("Simple")
    Cliente cliente;
}