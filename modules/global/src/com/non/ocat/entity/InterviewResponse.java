package com.non.ocat.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;

@Table(name = "OCAT_INTERVIEW_RESPONSE")
@Entity(name = "ocat_InterviewResponse")
public class InterviewResponse extends StandardEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QUESTION_ID")
    protected Questionnaire question;

    @Lookup(type = LookupType.DROPDOWN)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSE_ID")
    protected ResponseTypeConfig response;

    @Lob
    @Column(name = "TEXT_RESPONSE")
    protected String textResponse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERVIEW_ID")
    protected Interview interview;

    public void setResponse(ResponseTypeConfig response) {
        this.response = response;
    }

    public ResponseTypeConfig getResponse() {
        return response;
    }

    public Interview getInterview() {
        return interview;
    }

    public void setInterview(Interview interview) {
        this.interview = interview;
    }

    public String getTextResponse() {
        return textResponse;
    }

    public void setTextResponse(String textResponse) {
        this.textResponse = textResponse;
    }

    public Questionnaire getQuestion() {
        return question;
    }

    public void setQuestion(Questionnaire question) {
        this.question = question;
    }

}