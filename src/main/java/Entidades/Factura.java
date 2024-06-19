package Entidades;

import Entidades.Enums.FormaPago;

import java.time.LocalDate;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Factura")
public class Factura implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fechaFacturacion")
    private static LocalDate fechaFacturacion;
    @Column(name ="mpPaymentId")
    private Integer mpPaymentId;
    @Column(name ="mpMerchantOrderId")
    private Integer mpMerchantOrderId;
    @Column(name ="mpPaymentType")
    private String mpPaymentType;
    @Column(name ="formaPago")
    private FormaPago formaPago;
    @Column(name ="totalVenta")
    private  Double totalVenta;

    public Factura() {
    }

    public Factura(Integer mpPaymentId, Integer mpMerchantOrderId, String mpPaymentType, FormaPago formaPago, Double totalVenta) {
        this.mpPaymentId = mpPaymentId;
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.mpPaymentType = mpPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
    }

    public static LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public static void setFechaFacturacion(LocalDate fechaFacturacion) {
        Factura.fechaFacturacion = fechaFacturacion;
    }

    public Integer getMpPaymentId() {
        return mpPaymentId;
    }

    public void setMpPaymentId(Integer mpPaymentId) {
        this.mpPaymentId = mpPaymentId;
    }

    public Integer getMpMerchantOrderId() {
        return mpMerchantOrderId;
    }

    public void setMpMerchantOrderId(Integer mpMerchantOrderId) {
        this.mpMerchantOrderId = mpMerchantOrderId;
    }

    public String getMpPaymentType() {
        return mpPaymentType;
    }

    public void setMpPaymentType(String mpPaymentType) {
        this.mpPaymentType = mpPaymentType;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }
}
