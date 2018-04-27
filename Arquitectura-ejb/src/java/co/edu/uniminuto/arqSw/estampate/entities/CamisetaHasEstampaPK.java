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
public class CamisetaHasEstampaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idCamiseta_has_Estampa")
    private int idCamisetahasEstampa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Pedido_idPedido")
    private int pedidoidPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Pedido_Cliente_idCliente")
    private int pedidoClienteidCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Pedido_Cliente_Usuario_idUsuario")
    private int pedidoClienteUsuarioidUsuario;

    public CamisetaHasEstampaPK() {
    }

    public CamisetaHasEstampaPK(int idCamisetahasEstampa, int pedidoidPedido, int pedidoClienteidCliente, int pedidoClienteUsuarioidUsuario) {
        this.idCamisetahasEstampa = idCamisetahasEstampa;
        this.pedidoidPedido = pedidoidPedido;
        this.pedidoClienteidCliente = pedidoClienteidCliente;
        this.pedidoClienteUsuarioidUsuario = pedidoClienteUsuarioidUsuario;
    }

    public int getIdCamisetahasEstampa() {
        return idCamisetahasEstampa;
    }

    public void setIdCamisetahasEstampa(int idCamisetahasEstampa) {
        this.idCamisetahasEstampa = idCamisetahasEstampa;
    }

    public int getPedidoidPedido() {
        return pedidoidPedido;
    }

    public void setPedidoidPedido(int pedidoidPedido) {
        this.pedidoidPedido = pedidoidPedido;
    }

    public int getPedidoClienteidCliente() {
        return pedidoClienteidCliente;
    }

    public void setPedidoClienteidCliente(int pedidoClienteidCliente) {
        this.pedidoClienteidCliente = pedidoClienteidCliente;
    }

    public int getPedidoClienteUsuarioidUsuario() {
        return pedidoClienteUsuarioidUsuario;
    }

    public void setPedidoClienteUsuarioidUsuario(int pedidoClienteUsuarioidUsuario) {
        this.pedidoClienteUsuarioidUsuario = pedidoClienteUsuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCamisetahasEstampa;
        hash += (int) pedidoidPedido;
        hash += (int) pedidoClienteidCliente;
        hash += (int) pedidoClienteUsuarioidUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CamisetaHasEstampaPK)) {
            return false;
        }
        CamisetaHasEstampaPK other = (CamisetaHasEstampaPK) object;
        if (this.idCamisetahasEstampa != other.idCamisetahasEstampa) {
            return false;
        }
        if (this.pedidoidPedido != other.pedidoidPedido) {
            return false;
        }
        if (this.pedidoClienteidCliente != other.pedidoClienteidCliente) {
            return false;
        }
        if (this.pedidoClienteUsuarioidUsuario != other.pedidoClienteUsuarioidUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.CamisetaHasEstampaPK[ idCamisetahasEstampa=" + idCamisetahasEstampa + ", pedidoidPedido=" + pedidoidPedido + ", pedidoClienteidCliente=" + pedidoClienteidCliente + ", pedidoClienteUsuarioidUsuario=" + pedidoClienteUsuarioidUsuario + " ]";
    }
    
}
