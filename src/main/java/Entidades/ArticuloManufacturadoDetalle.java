package Entidades;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ArticuloManufacturadoDetalle")
public class ArticuloManufacturadoDetalle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalle")
    private Integer detalle;

    public ArticuloManufacturadoDetalle() {
    }

    public ArticuloManufacturadoDetalle(Integer detalle) {
        this.detalle = detalle;
    }

    public Integer getDetalle() {
        return detalle;
    }

    public void setDetalle(Integer detalle) {
        this.detalle = detalle;
    }
}
