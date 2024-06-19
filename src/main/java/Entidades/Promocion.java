package Entidades;

import Entidades.Enums.TipoPromocion;

import java.time.LocalDate;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

  @Entity
  @Table(name = "Promocion")
public class Promocion  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "fechaDesde")
    private LocalDate fechaDesde;
    @Column(name ="fechaHasta")
    private LocalDate fechaHasta;
    @Column(name ="horaDesde")
    private LocalDate horaDesde;
    @Column(name ="horaHasta")
    private LocalDate horaHasta;
    @Column(name ="descripcionDescuento")
    private String descripcionDescuento;
    @Column(name ="precioPromocional")
    private Double precioPromocional;

    @Column(name ="tipoPromocion")
    private TipoPromocion tipoPromocion;

    public Promocion() {
    }

      public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalDate horaDesde, LocalDate horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion) {
          this.denominacion = denominacion;
          this.fechaDesde = fechaDesde;
          this.fechaHasta = fechaHasta;
          this.horaDesde = horaDesde;
          this.horaHasta = horaHasta;
          this.descripcionDescuento = descripcionDescuento;
          this.precioPromocional = precioPromocional;
          this.tipoPromocion = tipoPromocion;
      }

      public String getDenominacion() {
          return denominacion;
      }

      public void setDenominacion(String denominacion) {
          this.denominacion = denominacion;
      }

      public LocalDate getFechaDesde() {
          return fechaDesde;
      }

      public void setFechaDesde(LocalDate fechaDesde) {
          this.fechaDesde = fechaDesde;
      }

      public LocalDate getFechaHasta() {
          return fechaHasta;
      }

      public void setFechaHasta(LocalDate fechaHasta) {
          this.fechaHasta = fechaHasta;
      }

      public LocalDate getHoraDesde() {
          return horaDesde;
      }

      public void setHoraDesde(LocalDate horaDesde) {
          this.horaDesde = horaDesde;
      }

      public LocalDate getHoraHasta() {
          return horaHasta;
      }

      public void setHoraHasta(LocalDate horaHasta) {
          this.horaHasta = horaHasta;
      }

      public String getDescripcionDescuento() {
          return descripcionDescuento;
      }

      public void setDescripcionDescuento(String descripcionDescuento) {
          this.descripcionDescuento = descripcionDescuento;
      }

      public Double getPrecioPromocional() {
          return precioPromocional;
      }

      public void setPrecioPromocional(Double precioPromocional) {
          this.precioPromocional = precioPromocional;
      }

      public TipoPromocion getTipoPromocion() {
          return tipoPromocion;
      }

      public void setTipoPromocion(TipoPromocion tipoPromocion) {
          this.tipoPromocion = tipoPromocion;
      }
  }
