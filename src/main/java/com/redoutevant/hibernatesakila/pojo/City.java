package com.redoutevant.hibernatesakila.pojo;
// Generated Nov 15, 2017 10:19:59 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name="city"
    ,catalog="sakila"
)
public class City  implements java.io.Serializable {

     private Short cityId;
     private Country country;
     private String city;
     private Date lastUpdate;

    public City() {
    }

    public City(Country country, String city, Date lastUpdate) {
       this.country = country;
       this.city = city;
       this.lastUpdate = lastUpdate;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="city_id", unique=true, nullable=false)
    public Short getCityId() {
        return this.cityId;
    }
    
    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="country_id", nullable=false)
    public Country getCountry() {
        return this.country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }

    
    @Column(name="city", nullable=false, length=50)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false, length=19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

