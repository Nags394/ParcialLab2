package Entidades;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ArticuloInsumo")
public class ArticuloInsumo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "precioCompra")
    private Double precioCompra;
    @Column(name = "stockActual")
    private Integer stockActual;
    @Column(name = "stockMaximo")
    private Integer stockMaximo;
    @Column(name = "esParaElaborar")
    private Boolean esParaElaborar;

    public ArticuloInsumo() {
    }

    public ArticuloInsumo(Double precioCompra, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar) {
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Boolean getEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(Boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }
}