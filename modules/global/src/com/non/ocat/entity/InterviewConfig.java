package com.non.ocat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s %s|itemCode,itemName")
@Table(name = "OCAT_INTERVIEW_CONFIG")
@Entity(name = "ocat_InterviewConfig")
public class InterviewConfig extends StandardEntity {
    @Column(name = "ITEM_CODE")
    protected String itemCode;

    @Lob
    @Column(name = "ITEM_NAME")
    protected String itemName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    protected InterviewConfig parent;

    @Temporal(TemporalType.DATE)
    @Column(name = "BEGIN_DATE")
    protected Date beginDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "END_DATE")
    protected Date endDate;

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public InterviewConfig getParent() {
        return parent;
    }

    public void setParent(InterviewConfig parent) {
        this.parent = parent;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}