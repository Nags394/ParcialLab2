package Entidades;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ArticuloManufacturado")
public class ArticuloManufacturado implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "descpcion")
    private String descripcion;
    @Column(name = "tiempoEstimadoMinutos")
    private Integer tiempoEstimadoMinutos;
    @Column(name = "preparacion")
    private String preparacion;

    public ArticuloManufacturado() {
    }

    public ArticuloManufacturado(String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
}
