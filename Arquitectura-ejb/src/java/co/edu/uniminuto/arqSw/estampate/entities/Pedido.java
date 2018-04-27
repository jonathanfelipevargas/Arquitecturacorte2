/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.estampate.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByIdPedido", query = "SELECT p FROM Pedido p WHERE p.pedidoPK.idPedido = :idPedido"),
    @NamedQuery(name = "Pedido.findByFechaPeticion", query = "SELECT p FROM Pedido p WHERE p.fechaPeticion = :fechaPeticion"),
    @NamedQuery(name = "Pedido.findByFechaEntrega", query = "SELECT p FROM Pedido p WHERE p.fechaEntrega = :fechaEntrega"),
    @NamedQuery(name = "Pedido.findByEstadoPedido", query = "SELECT p FROM Pedido p WHERE p.estadoPedido = :estadoPedido"),
    @NamedQuery(name = "Pedido.findByValorPedido", query = "SELECT p FROM Pedido p WHERE p.valorPedido = :valorPedido"),
    @NamedQuery(name = "Pedido.findByDireccionDestino", query = "SELECT p FROM Pedido p WHERE p.direccionDestino = :direccionDestino"),
    @NamedQuery(name = "Pedido.findByTelefonoRemitente", query = "SELECT p FROM Pedido p WHERE p.telefonoRemitente = :telefonoRemitente"),
    @NamedQuery(name = "Pedido.findByPais", query = "SELECT p FROM Pedido p WHERE p.pais = :pais"),
    @NamedQuery(name = "Pedido.findByCiudad", query = "SELECT p FROM Pedido p WHERE p.ciudad = :ciudad"),
    @NamedQuery(name = "Pedido.findByBarrio", query = "SELECT p FROM Pedido p WHERE p.barrio = :barrio"),
    @NamedQuery(name = "Pedido.findByCorreoDestinatario", query = "SELECT p FROM Pedido p WHERE p.correoDestinatario = :correoDestinatario"),
    @NamedQuery(name = "Pedido.findByClienteidCliente", query = "SELECT p FROM Pedido p WHERE p.pedidoPK.clienteidCliente = :clienteidCliente"),
    @NamedQuery(name = "Pedido.findByClienteUsuarioidUsuario", query = "SELECT p FROM Pedido p WHERE p.pedidoPK.clienteUsuarioidUsuario = :clienteUsuarioidUsuario")})
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidoPK pedidoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaPeticion")
    @Temporal(TemporalType.DATE)
    private Date fechaPeticion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaEntrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estadoPedido")
    private String estadoPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorPedido")
    private double valorPedido;
    @Size(max = 45)
    @Column(name = "direccionDestino")
    private String direccionDestino;
    @Size(max = 45)
    @Column(name = "telefonoRemitente")
    private String telefonoRemitente;
    @Size(max = 45)
    @Column(name = "pais")
    private String pais;
    @Size(max = 45)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 45)
    @Column(name = "barrio")
    private String barrio;
    @Size(max = 45)
    @Column(name = "correoDestinatario")
    private String correoDestinatario;
    @JoinColumns({
        @JoinColumn(name = "Cliente_idCliente", referencedColumnName = "idCliente", insertable = false, updatable = false),
        @JoinColumn(name = "Cliente_Usuario_idUsuario", referencedColumnName = "Usuario_idUsuario", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private List<CamisetaHasEstampa> camisetaHasEstampaList;

    public Pedido() {
    }

    public Pedido(PedidoPK pedidoPK) {
        this.pedidoPK = pedidoPK;
    }

    public Pedido(PedidoPK pedidoPK, Date fechaPeticion, Date fechaEntrega, String estadoPedido, double valorPedido) {
        this.pedidoPK = pedidoPK;
        this.fechaPeticion = fechaPeticion;
        this.fechaEntrega = fechaEntrega;
        this.estadoPedido = estadoPedido;
        this.valorPedido = valorPedido;
    }

    public Pedido(int idPedido, int clienteidCliente, int clienteUsuarioidUsuario) {
        this.pedidoPK = new PedidoPK(idPedido, clienteidCliente, clienteUsuarioidUsuario);
    }

    public PedidoPK getPedidoPK() {
        return pedidoPK;
    }

    public void setPedidoPK(PedidoPK pedidoPK) {
        this.pedidoPK = pedidoPK;
    }

    public Date getFechaPeticion() {
        return fechaPeticion;
    }

    public void setFechaPeticion(Date fechaPeticion) {
        this.fechaPeticion = fechaPeticion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getTelefonoRemitente() {
        return telefonoRemitente;
    }

    public void setTelefonoRemitente(String telefonoRemitente) {
        this.telefonoRemitente = telefonoRemitente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCorreoDestinatario() {
        return correoDestinatario;
    }

    public void setCorreoDestinatario(String correoDestinatario) {
        this.correoDestinatario = correoDestinatario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @XmlTransient
    public List<CamisetaHasEstampa> getCamisetaHasEstampaList() {
        return camisetaHasEstampaList;
    }

    public void setCamisetaHasEstampaList(List<CamisetaHasEstampa> camisetaHasEstampaList) {
        this.camisetaHasEstampaList = camisetaHasEstampaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoPK != null ? pedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedidoPK == null && other.pedidoPK != null) || (this.pedidoPK != null && !this.pedidoPK.equals(other.pedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.Pedido[ pedidoPK=" + pedidoPK + " ]";
    }
    
}
