/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.estampate.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Jonathan
 */
@Embeddable
public class TarjetaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idTarjeta")
    private int idTarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cliente_idCliente")
    private int clienteidCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cliente_Usuario_idUsuario")
    private int clienteUsuarioidUsuario;

    public TarjetaPK() {
    }

    public TarjetaPK(int idTarjeta, int clienteidCliente, int clienteUsuarioidUsuario) {
        this.idTarjeta = idTarjeta;
        this.clienteidCliente = clienteidCliente;
        this.clienteUsuarioidUsuario = clienteUsuarioidUsuario;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getClienteidCliente() {
        return clienteidCliente;
    }

    public void setClienteidCliente(int clienteidCliente) {
        this.clienteidCliente = clienteidCliente;
    }

    public int getClienteUsuarioidUsuario() {
        return clienteUsuarioidUsuario;
    }

    public void setClienteUsuarioidUsuario(int clienteUsuarioidUsuario) {
        this.clienteUsuarioidUsuario = clienteUsuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTarjeta;
        hash += (int) clienteidCliente;
        hash += (int) clienteUsuarioidUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarjetaPK)) {
            return false;
        }
        TarjetaPK other = (TarjetaPK) object;
        if (this.idTarjeta != other.idTarjeta) {
            return false;
        }
        if (this.clienteidCliente != other.clienteidCliente) {
            return false;
        }
        if (this.clienteUsuarioidUsuario != other.clienteUsuarioidUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.TarjetaPK[ idTarjeta=" + idTarjeta + ", clienteidCliente=" + clienteidCliente + ", clienteUsuarioidUsuario=" + clienteUsuarioidUsuario + " ]";
    }
    
}
