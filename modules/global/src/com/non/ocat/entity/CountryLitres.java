package com.non.ocat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s: %s|country,litres")
@Table(name = "SAMPLER_COUNTRY_LITRES")
@Entity(name = "ocat_CountryLitres")
public class CountryLitres extends StandardEntity {
    private static final long serialVersionUID = 7444256974190550437L;

    @Column(name = "COUNTRY", nullable = false)
    protected String country;

    @Column(name = "LITRES", nullable = false)
    protected Double litres;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setLitres(Double litres) {
        this.litres = litres;
    }

    public Double getLitres() {
        return litres;
    }
}