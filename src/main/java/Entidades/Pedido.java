package Entidades;

import Entidades.Enums.Estado;
import Entidades.Enums.FormaPago;
import Entidades.Enums.TipoEnvio;

import javax.swing.plaf.BorderUIResource;
import java.beans.ConstructorProperties;
import java.time.LocalDate;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Pedido")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "horaEstimadaFinalizacion")
    private static LocalDate horaEstimadaFinalizacion;
    @Column(name ="total")
    private  Double total;
    @Column(name ="totalCosto")
    private  Double totalCosto;
    @Column(name ="estado")
    private Estado estado;
    @Column(name ="tipoEnvio")
    private TipoEnvio tipoEnvio;
    @Column(name ="formaPago")
    private FormaPago formaPago;

    @Column(name ="fechaPedido")
    private static LocalDate fechaPedido;

    public Pedido() {
    }

    public Pedido(Double total, Double totalCosto, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago) {
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
    }

    public static LocalDate getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public static void setHoraEstimadaFinalizacion(LocalDate horaEstimadaFinalizacion) {
        Pedido.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(Double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public static LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public static void setFechaPedido(LocalDate fechaPedido) {
        Pedido.fechaPedido = fechaPedido;
    }
}
