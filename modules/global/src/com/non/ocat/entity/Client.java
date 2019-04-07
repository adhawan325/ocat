package com.non.ocat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s %s %s %s %s|firstName,lastName,dateOfBirth,cin,aucn")
@Table(name = "OCAT_CLIENT")
@Entity(name = "ocat_Client")
public class Client extends StandardEntity {
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "client")
    protected CWCase cwCase;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    @Column(name = "LAST_NAME")
    protected String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_BIRTH")
    protected Date dateOfBirth;

    @Column(name = "CIN", length = 9)
    protected String cin;

    @Column(name = "AUCN", length = 10)
    protected String aucn;

    @Column(name = "SSN", length = 15)
    protected String ssn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GENDER_ID")
    protected GenderConfig gender;

    public GenderConfig getGender() {
        return gender;
    }

    public void setGender(GenderConfig gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAucn() {
        return aucn;
    }

    public void setAucn(String aucn) {
        this.aucn = aucn;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public CWCase getCwCase() {
        return cwCase;
    }

    public void setCwCase(CWCase cwCase) {
        this.cwCase = cwCase;
    }
}