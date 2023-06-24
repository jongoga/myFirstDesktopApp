/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Personi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personi.findAll", query = "SELECT p FROM Personi p"),
    @NamedQuery(name = "Personi.findById", query = "SELECT p FROM Personi p WHERE p.id = :id"),
    @NamedQuery(name = "Personi.findByEmertimi", query = "SELECT p FROM Personi p WHERE p.emertimi = :emertimi")})
public class Personi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Emertimi")
    private String emertimi;

    public Personi() {
    }

    public Personi(Integer id) {
        this.id = id;
    }

    public Personi(Integer id, String emertimi) {
        this.id = id;
        this.emertimi = emertimi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmertimi() {
        return emertimi;
    }

    public void setEmertimi(String emertimi) {
        this.emertimi = emertimi;
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
        if (!(object instanceof Personi)) {
            return false;
        }
        Personi other = (Personi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Personi[ id=" + id + " ]";
    }
    
}
