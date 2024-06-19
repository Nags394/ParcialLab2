package Entidades;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name = "Sucursal")
public class Sucursal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "horarioApertura")
    private LocalTime horarioApertura;
    @Column(name = "horarioCierre")
    private LocalTime horarioCierre;
    @Column(name = "casaMatriz")
    private Boolean casaMatriz;
}
