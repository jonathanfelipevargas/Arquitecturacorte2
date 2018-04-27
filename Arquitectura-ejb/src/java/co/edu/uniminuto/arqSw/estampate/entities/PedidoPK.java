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
public class PedidoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idPedido")
    private int idPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cliente_idCliente")
    private int clienteidCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cliente_Usuario_idUsuario")
    private int clienteUsuarioidUsuario;

    public PedidoPK() {
    }

    public PedidoPK(int idPedido, int clienteidCliente, int clienteUsuarioidUsuario) {
        this.idPedido = idPedido;
        this.clienteidCliente = clienteidCliente;
        this.clienteUsuarioidUsuario = clienteUsuarioidUsuario;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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
        hash += (int) idPedido;
        hash += (int) clienteidCliente;
        hash += (int) clienteUsuarioidUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoPK)) {
            return false;
        }
        PedidoPK other = (PedidoPK) object;
        if (this.idPedido != other.idPedido) {
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
        return "co.edu.uniminuto.arqSw.estampate.entities.PedidoPK[ idPedido=" + idPedido + ", clienteidCliente=" + clienteidCliente + ", clienteUsuarioidUsuario=" + clienteUsuarioidUsuario + " ]";
    }
    
}
