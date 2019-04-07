package com.non.ocat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s|questionText")
@Table(name = "OCAT_QUESTIONNAIRE")
@Entity(name = "ocat_Questionnaire")
public class Questionnaire extends StandardEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERVIEW_SECTION_ID")
    protected InterviewConfig interviewSection;

    @Lob
    @Column(name = "QUESTION_TEXT")
    protected String questionText;

    @Column(name = "NEEDS_TEXT")
    protected Boolean needsText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    protected Questionnaire parent;

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

    public Questionnaire getParent() {
        return parent;
    }

    public void setParent(Questionnaire parent) {
        this.parent = parent;
    }

    public Boolean getNeedsText() {
        return needsText;
    }

    public void setNeedsText(Boolean needsText) {
        this.needsText = needsText;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public InterviewConfig getInterviewSection() {
        return interviewSection;
    }

    public void setInterviewSection(InterviewConfig interviewSection) {
        this.interviewSection = interviewSection;
    }
}