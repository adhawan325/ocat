package com.non.ocat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERVIEWER_ID")
    protected User interviewer;

    public User getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(User interviewer) {
        this.interviewer = interviewer;
    }

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