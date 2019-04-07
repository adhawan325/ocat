package com.non.ocat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s %s|client,createTs")
@Table(name = "OCAT_INTERVIEW")
@Entity(name = "ocat_Interview")
public class Interview extends StandardEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RELATED_CASE_ID")
    protected CWCase relatedCase;

    public CWCase getRelatedCase() {
        return relatedCase;
    }

    public void setRelatedCase(CWCase relatedCase) {
        this.relatedCase = relatedCase;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}