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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "cliente_has_estampa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClienteHasEstampa.findAll", query = "SELECT c FROM ClienteHasEstampa c"),
    @NamedQuery(name = "ClienteHasEstampa.findByClienteidCliente", query = "SELECT c FROM ClienteHasEstampa c WHERE c.clienteHasEstampaPK.clienteidCliente = :clienteidCliente"),
    @NamedQuery(name = "ClienteHasEstampa.findByClienteUsuarioidUsuario", query = "SELECT c FROM ClienteHasEstampa c WHERE c.clienteHasEstampaPK.clienteUsuarioidUsuario = :clienteUsuarioidUsuario"),
    @NamedQuery(name = "ClienteHasEstampa.findByEstampaidEstampa", query = "SELECT c FROM ClienteHasEstampa c WHERE c.clienteHasEstampaPK.estampaidEstampa = :estampaidEstampa"),
    @NamedQuery(name = "ClienteHasEstampa.findByEstampaArtistaidArstista", query = "SELECT c FROM ClienteHasEstampa c WHERE c.clienteHasEstampaPK.estampaArtistaidArstista = :estampaArtistaidArstista"),
    @NamedQuery(name = "ClienteHasEstampa.findByEstampaArtistaUsuarioidUsuario", query = "SELECT c FROM ClienteHasEstampa c WHERE c.clienteHasEstampaPK.estampaArtistaUsuarioidUsuario = :estampaArtistaUsuarioidUsuario"),
    @NamedQuery(name = "ClienteHasEstampa.findByCalificacion", query = "SELECT c FROM ClienteHasEstampa c WHERE c.calificacion = :calificacion")})
public class ClienteHasEstampa implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClienteHasEstampaPK clienteHasEstampaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calificacion")
    private int calificacion;
    @JoinColumns({
        @JoinColumn(name = "Cliente_idCliente", referencedColumnName = "idCliente", insertable = false, updatable = false),
        @JoinColumn(name = "Cliente_Usuario_idUsuario", referencedColumnName = "Usuario_idUsuario", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumns({
        @JoinColumn(name = "Estampa_idEstampa", referencedColumnName = "idEstampa", insertable = false, updatable = false),
        @JoinColumn(name = "Estampa_Artista_idArstista", referencedColumnName = "Artista_idArstista", insertable = false, updatable = false),
        @JoinColumn(name = "Estampa_Artista_Usuario_idUsuario", referencedColumnName = "Artista_Usuario_idUsuario", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Estampa estampa;

    public ClienteHasEstampa() {
    }

    public ClienteHasEstampa(ClienteHasEstampaPK clienteHasEstampaPK) {
        this.clienteHasEstampaPK = clienteHasEstampaPK;
    }

    public ClienteHasEstampa(ClienteHasEstampaPK clienteHasEstampaPK, int calificacion) {
        this.clienteHasEstampaPK = clienteHasEstampaPK;
        this.calificacion = calificacion;
    }

    public ClienteHasEstampa(int clienteidCliente, int clienteUsuarioidUsuario, int estampaidEstampa, int estampaArtistaidArstista, int estampaArtistaUsuarioidUsuario) {
        this.clienteHasEstampaPK = new ClienteHasEstampaPK(clienteidCliente, clienteUsuarioidUsuario, estampaidEstampa, estampaArtistaidArstista, estampaArtistaUsuarioidUsuario);
    }

    public ClienteHasEstampaPK getClienteHasEstampaPK() {
        return clienteHasEstampaPK;
    }

    public void setClienteHasEstampaPK(ClienteHasEstampaPK clienteHasEstampaPK) {
        this.clienteHasEstampaPK = clienteHasEstampaPK;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estampa getEstampa() {
        return estampa;
    }

    public void setEstampa(Estampa estampa) {
        this.estampa = estampa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clienteHasEstampaPK != null ? clienteHasEstampaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteHasEstampa)) {
            return false;
        }
        ClienteHasEstampa other = (ClienteHasEstampa) object;
        if ((this.clienteHasEstampaPK == null && other.clienteHasEstampaPK != null) || (this.clienteHasEstampaPK != null && !this.clienteHasEstampaPK.equals(other.clienteHasEstampaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.ClienteHasEstampa[ clienteHasEstampaPK=" + clienteHasEstampaPK + " ]";
    }
    
}
