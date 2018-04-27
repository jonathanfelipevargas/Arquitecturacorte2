/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.estampate.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "estampa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estampa.findAll", query = "SELECT e FROM Estampa e"),
    @NamedQuery(name = "Estampa.findByIdEstampa", query = "SELECT e FROM Estampa e WHERE e.estampaPK.idEstampa = :idEstampa"),
    @NamedQuery(name = "Estampa.findByNombre", query = "SELECT e FROM Estampa e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estampa.findByLargo", query = "SELECT e FROM Estampa e WHERE e.largo = :largo"),
    @NamedQuery(name = "Estampa.findByAncho", query = "SELECT e FROM Estampa e WHERE e.ancho = :ancho"),
    @NamedQuery(name = "Estampa.findByEstado", query = "SELECT e FROM Estampa e WHERE e.estado = :estado"),
    @NamedQuery(name = "Estampa.findByUbicacionFoto", query = "SELECT e FROM Estampa e WHERE e.ubicacionFoto = :ubicacionFoto"),
    @NamedQuery(name = "Estampa.findByPupularidad", query = "SELECT e FROM Estampa e WHERE e.pupularidad = :pupularidad"),
    @NamedQuery(name = "Estampa.findByRating", query = "SELECT e FROM Estampa e WHERE e.rating = :rating"),
    @NamedQuery(name = "Estampa.findByPrecio", query = "SELECT e FROM Estampa e WHERE e.precio = :precio"),
    @NamedQuery(name = "Estampa.findByArtistaidArstista", query = "SELECT e FROM Estampa e WHERE e.estampaPK.artistaidArstista = :artistaidArstista"),
    @NamedQuery(name = "Estampa.findByArtistaUsuarioidUsuario", query = "SELECT e FROM Estampa e WHERE e.estampaPK.artistaUsuarioidUsuario = :artistaUsuarioidUsuario")})
public class Estampa implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstampaPK estampaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "largo")
    private double largo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ancho")
    private double ancho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ubicacionFoto")
    private String ubicacionFoto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pupularidad")
    private double pupularidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating")
    private double rating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estampa")
    private List<ClienteHasEstampa> clienteHasEstampaList;
    @JoinColumns({
        @JoinColumn(name = "Artista_idArstista", referencedColumnName = "idArstista", insertable = false, updatable = false),
        @JoinColumn(name = "Artista_Usuario_idUsuario", referencedColumnName = "Usuario_idUsuario", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Artista artista;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estampa")
    private List<Tema> temaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estampa")
    private List<Imagen> imagenList;

    public Estampa() {
    }

    public Estampa(EstampaPK estampaPK) {
        this.estampaPK = estampaPK;
    }

    public Estampa(EstampaPK estampaPK, String nombre, double largo, double ancho, String estado, String ubicacionFoto, double pupularidad, double rating, double precio) {
        this.estampaPK = estampaPK;
        this.nombre = nombre;
        this.largo = largo;
        this.ancho = ancho;
        this.estado = estado;
        this.ubicacionFoto = ubicacionFoto;
        this.pupularidad = pupularidad;
        this.rating = rating;
        this.precio = precio;
    }

    public Estampa(int idEstampa, int artistaidArstista, int artistaUsuarioidUsuario) {
        this.estampaPK = new EstampaPK(idEstampa, artistaidArstista, artistaUsuarioidUsuario);
    }

    public EstampaPK getEstampaPK() {
        return estampaPK;
    }

    public void setEstampaPK(EstampaPK estampaPK) {
        this.estampaPK = estampaPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacionFoto() {
        return ubicacionFoto;
    }

    public void setUbicacionFoto(String ubicacionFoto) {
        this.ubicacionFoto = ubicacionFoto;
    }

    public double getPupularidad() {
        return pupularidad;
    }

    public void setPupularidad(double pupularidad) {
        this.pupularidad = pupularidad;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @XmlTransient
    public List<ClienteHasEstampa> getClienteHasEstampaList() {
        return clienteHasEstampaList;
    }

    public void setClienteHasEstampaList(List<ClienteHasEstampa> clienteHasEstampaList) {
        this.clienteHasEstampaList = clienteHasEstampaList;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @XmlTransient
    public List<Tema> getTemaList() {
        return temaList;
    }

    public void setTemaList(List<Tema> temaList) {
        this.temaList = temaList;
    }

    @XmlTransient
    public List<Imagen> getImagenList() {
        return imagenList;
    }

    public void setImagenList(List<Imagen> imagenList) {
        this.imagenList = imagenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estampaPK != null ? estampaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estampa)) {
            return false;
        }
        Estampa other = (Estampa) object;
        if ((this.estampaPK == null && other.estampaPK != null) || (this.estampaPK != null && !this.estampaPK.equals(other.estampaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.Estampa[ estampaPK=" + estampaPK + " ]";
    }
    
}
