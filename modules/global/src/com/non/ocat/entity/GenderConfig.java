package com.non.ocat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|gender")
@Table(name = "OCAT_GENDER_CONFIG")
@Entity(name = "ocat_GenderConfig")
public class GenderConfig extends StandardEntity {

    @Column(name = "CONFIG_CODE")
    protected String configCode;

    @Column(name = "GENDER")
    protected String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }
}