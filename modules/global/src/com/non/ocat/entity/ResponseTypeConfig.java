package com.non.ocat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|response")
@Table(name = "OCAT_RESPONSE_TYPE_CONFIG")
@Entity(name = "ocat_ResponseTypeConfig")
public class ResponseTypeConfig extends StandardEntity {
    @Column(name = "CONFIG_CODE")
    protected String configCode;

    @Column(name = "RESPONSE")
    protected String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }
}