/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicordoba.registro.basededatos.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author osnaider
 */
@Entity
@Table(name = "utencilio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utencilio.findAll", query = "SELECT u FROM Utencilio u"),
    @NamedQuery(name = "Utencilio.findById", query = "SELECT u FROM Utencilio u WHERE u.id = :id"),
    @NamedQuery(name = "Utencilio.findByEstado", query = "SELECT u FROM Utencilio u WHERE u.estado = :estado"),
    @NamedQuery(name = "Utencilio.findByDescripcion", query = "SELECT u FROM Utencilio u WHERE u.descripcion = :descripcion"),
    @NamedQuery(name = "Utencilio.findByCodigo", query = "SELECT u FROM Utencilio u WHERE u.codigo = :codigo")})
public class Utencilio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "estado")
    private String estado;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "codigo")
    private String codigo;

    public Utencilio() {
    }

    public Utencilio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utencilio)) {
            return false;
        }
        Utencilio other = (Utencilio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "unicordoba.registro.basededatos.entity.Utencilio[ id=" + id + " ]";
    }
    
}
