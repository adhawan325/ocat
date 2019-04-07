package com.non.ocat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|caseStatus")
@Table(name = "OCAT_CASE_STATUS_CONFIG")
@Entity(name = "ocat_CaseStatusConfig")
public class CaseStatusConfig extends StandardEntity {
    @Column(name = "CONFIG_CODE")
    protected String configCode;

    @Column(name = "CASE_STATUS")
    protected String caseStatus;

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }
}