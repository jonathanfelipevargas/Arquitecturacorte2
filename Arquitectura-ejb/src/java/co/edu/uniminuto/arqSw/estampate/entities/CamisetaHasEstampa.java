/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.estampate.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "camiseta_has_estampa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CamisetaHasEstampa.findAll", query = "SELECT c FROM CamisetaHasEstampa c"),
    @NamedQuery(name = "CamisetaHasEstampa.findByIdCamisetahasEstampa", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.camisetaHasEstampaPK.idCamisetahasEstampa = :idCamisetahasEstampa"),
    @NamedQuery(name = "CamisetaHasEstampa.findByEstiloCamiseta", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.estiloCamiseta = :estiloCamiseta"),
    @NamedQuery(name = "CamisetaHasEstampa.findByTallaCamiseta", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.tallaCamiseta = :tallaCamiseta"),
    @NamedQuery(name = "CamisetaHasEstampa.findByColorCamiseta", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.colorCamiseta = :colorCamiseta"),
    @NamedQuery(name = "CamisetaHasEstampa.findByUbicacionFrontalEstampado", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.ubicacionFrontalEstampado = :ubicacionFrontalEstampado"),
    @NamedQuery(name = "CamisetaHasEstampa.findByUbicacionPosteriorEstampado", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.ubicacionPosteriorEstampado = :ubicacionPosteriorEstampado"),
    @NamedQuery(name = "CamisetaHasEstampa.findByTexto", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.texto = :texto"),
    @NamedQuery(name = "CamisetaHasEstampa.findByCantdad", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.cantdad = :cantdad"),
    @NamedQuery(name = "CamisetaHasEstampa.findByPedidoidPedido", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.camisetaHasEstampaPK.pedidoidPedido = :pedidoidPedido"),
    @NamedQuery(name = "CamisetaHasEstampa.findByPedidoClienteidCliente", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.camisetaHasEstampaPK.pedidoClienteidCliente = :pedidoClienteidCliente"),
    @NamedQuery(name = "CamisetaHasEstampa.findByPedidoClienteUsuarioidUsuario", query = "SELECT c FROM CamisetaHasEstampa c WHERE c.camisetaHasEstampaPK.pedidoClienteUsuarioidUsuario = :pedidoClienteUsuarioidUsuario")})
public class CamisetaHasEstampa implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CamisetaHasEstampaPK camisetaHasEstampaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estiloCamiseta")
    private String estiloCamiseta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tallaCamiseta")
    private String tallaCamiseta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "colorCamiseta")
    private String colorCamiseta;
    @Size(max = 45)
    @Column(name = "ubicacionFrontalEstampado")
    private String ubicacionFrontalEstampado;
    @Size(max = 45)
    @Column(name = "ubicacionPosteriorEstampado")
    private String ubicacionPosteriorEstampado;
    @Size(max = 45)
    @Column(name = "texto")
    private String texto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantdad")
    private int cantdad;
    @JoinColumns({
        @JoinColumn(name = "Pedido_idPedido", referencedColumnName = "idPedido", insertable = false, updatable = false),
        @JoinColumn(name = "Pedido_Cliente_idCliente", referencedColumnName = "Cliente_idCliente", insertable = false, updatable = false),
        @JoinColumn(name = "Pedido_Cliente_Usuario_idUsuario", referencedColumnName = "Cliente_Usuario_idUsuario", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Pedido pedido;

    public CamisetaHasEstampa() {
    }

    public CamisetaHasEstampa(CamisetaHasEstampaPK camisetaHasEstampaPK) {
        this.camisetaHasEstampaPK = camisetaHasEstampaPK;
    }

    public CamisetaHasEstampa(CamisetaHasEstampaPK camisetaHasEstampaPK, String estiloCamiseta, String tallaCamiseta, String colorCamiseta, int cantdad) {
        this.camisetaHasEstampaPK = camisetaHasEstampaPK;
        this.estiloCamiseta = estiloCamiseta;
        this.tallaCamiseta = tallaCamiseta;
        this.colorCamiseta = colorCamiseta;
        this.cantdad = cantdad;
    }

    public CamisetaHasEstampa(int idCamisetahasEstampa, int pedidoidPedido, int pedidoClienteidCliente, int pedidoClienteUsuarioidUsuario) {
        this.camisetaHasEstampaPK = new CamisetaHasEstampaPK(idCamisetahasEstampa, pedidoidPedido, pedidoClienteidCliente, pedidoClienteUsuarioidUsuario);
    }

    public CamisetaHasEstampaPK getCamisetaHasEstampaPK() {
        return camisetaHasEstampaPK;
    }

    public void setCamisetaHasEstampaPK(CamisetaHasEstampaPK camisetaHasEstampaPK) {
        this.camisetaHasEstampaPK = camisetaHasEstampaPK;
    }

    public String getEstiloCamiseta() {
        return estiloCamiseta;
    }

    public void setEstiloCamiseta(String estiloCamiseta) {
        this.estiloCamiseta = estiloCamiseta;
    }

    public String getTallaCamiseta() {
        return tallaCamiseta;
    }

    public void setTallaCamiseta(String tallaCamiseta) {
        this.tallaCamiseta = tallaCamiseta;
    }

    public String getColorCamiseta() {
        return colorCamiseta;
    }

    public void setColorCamiseta(String colorCamiseta) {
        this.colorCamiseta = colorCamiseta;
    }

    public String getUbicacionFrontalEstampado() {
        return ubicacionFrontalEstampado;
    }

    public void setUbicacionFrontalEstampado(String ubicacionFrontalEstampado) {
        this.ubicacionFrontalEstampado = ubicacionFrontalEstampado;
    }

    public String getUbicacionPosteriorEstampado() {
        return ubicacionPosteriorEstampado;
    }

    public void setUbicacionPosteriorEstampado(String ubicacionPosteriorEstampado) {
        this.ubicacionPosteriorEstampado = ubicacionPosteriorEstampado;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getCantdad() {
        return cantdad;
    }

    public void setCantdad(int cantdad) {
        this.cantdad = cantdad;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (camisetaHasEstampaPK != null ? camisetaHasEstampaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CamisetaHasEstampa)) {
            return false;
        }
        CamisetaHasEstampa other = (CamisetaHasEstampa) object;
        if ((this.camisetaHasEstampaPK == null && other.camisetaHasEstampaPK != null) || (this.camisetaHasEstampaPK != null && !this.camisetaHasEstampaPK.equals(other.camisetaHasEstampaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.CamisetaHasEstampa[ camisetaHasEstampaPK=" + camisetaHasEstampaPK + " ]";
    }
    
}
