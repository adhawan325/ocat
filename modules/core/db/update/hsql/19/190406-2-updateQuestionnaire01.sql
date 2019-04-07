alter table OCAT_QUESTIONNAIRE add constraint FK_OCAT_QUESTIONNAIRE_ON_INTERVIEW_SECTION foreign key (INTERVIEW_SECTION_ID) references OCAT_INTERVIEW_CONFIG(ID);
create index IDX_OCAT_QUESTIONNAIRE_ON_INTERVIEW_SECTION on OCAT_QUESTIONNAIRE (INTERVIEW_SECTION_ID);