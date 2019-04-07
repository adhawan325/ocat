-- begin OCAT_CW_CASE
alter table OCAT_CW_CASE add constraint FK_OCAT_CW_CASE_ON_CLIENT foreign key (CLIENT_ID) references OCAT_CLIENT(ID)^
alter table OCAT_CW_CASE add constraint FK_OCAT_CW_CASE_ON_OWNER foreign key (OWNER_ID) references SEC_USER(ID)^
alter table OCAT_CW_CASE add constraint FK_OCAT_CW_CASE_ON_STATUS foreign key (STATUS_ID) references OCAT_CASE_STATUS_CONFIG(ID)^
create index IDX_OCAT_CW_CASE_ON_CLIENT on OCAT_CW_CASE (CLIENT_ID)^
create index IDX_OCAT_CW_CASE_ON_OWNER on OCAT_CW_CASE (OWNER_ID)^
create index IDX_OCAT_CW_CASE_ON_STATUS on OCAT_CW_CASE (STATUS_ID)^
-- end OCAT_CW_CASE
-- begin OCAT_INTERVIEW
alter table OCAT_INTERVIEW add constraint FK_OCAT_INTERVIEW_ON_CLIENT foreign key (CLIENT_ID) references OCAT_CLIENT(ID)^
alter table OCAT_INTERVIEW add constraint FK_OCAT_INTERVIEW_ON_RELATED_CASE foreign key (RELATED_CASE_ID) references OCAT_CW_CASE(ID)^
create index IDX_OCAT_INTERVIEW_ON_CLIENT on OCAT_INTERVIEW (CLIENT_ID)^
create index IDX_OCAT_INTERVIEW_ON_RELATED_CASE on OCAT_INTERVIEW (RELATED_CASE_ID)^
-- end OCAT_INTERVIEW
-- begin OCAT_CLIENT
alter table OCAT_CLIENT add constraint FK_OCAT_CLIENT_ON_GENDER foreign key (GENDER_ID) references OCAT_GENDER_CONFIG(ID)^
create index IDX_OCAT_CLIENT_ON_GENDER on OCAT_CLIENT (GENDER_ID)^
-- end OCAT_CLIENT
-- begin OCAT_INTERVIEW_CONFIG
alter table OCAT_INTERVIEW_CONFIG add constraint FK_OCAT_INTERVIEW_CONFIG_ON_PARENT foreign key (PARENT_ID) references OCAT_INTERVIEW_CONFIG(ID)^
create index IDX_OCAT_INTERVIEW_CONFIG_ON_PARENT on OCAT_INTERVIEW_CONFIG (PARENT_ID)^
-- end OCAT_INTERVIEW_CONFIG
-- begin OCAT_QUESTIONNAIRE
alter table OCAT_QUESTIONNAIRE add constraint FK_OCAT_QUESTIONNAIRE_ON_INTERVIEW_SECTION foreign key (INTERVIEW_SECTION_ID) references OCAT_INTERVIEW_CONFIG(ID)^
alter table OCAT_QUESTIONNAIRE add constraint FK_OCAT_QUESTIONNAIRE_ON_PARENT foreign key (PARENT_ID) references OCAT_QUESTIONNAIRE(ID)^
create index IDX_OCAT_QUESTIONNAIRE_ON_INTERVIEW_SECTION on OCAT_QUESTIONNAIRE (INTERVIEW_SECTION_ID)^
create index IDX_OCAT_QUESTIONNAIRE_ON_PARENT on OCAT_QUESTIONNAIRE (PARENT_ID)^
-- end OCAT_QUESTIONNAIRE
-- begin OCAT_INTERVIEW_RESPONSE
alter table OCAT_INTERVIEW_RESPONSE add constraint FK_OCAT_INTERVIEW_RESPONSE_ON_QUESTION foreign key (QUESTION_ID) references OCAT_QUESTIONNAIRE(ID)^
alter table OCAT_INTERVIEW_RESPONSE add constraint FK_OCAT_INTERVIEW_RESPONSE_ON_INTERVIEW foreign key (INTERVIEW_ID) references OCAT_INTERVIEW(ID)^
create index IDX_OCAT_INTERVIEW_RESPONSE_ON_QUESTION on OCAT_INTERVIEW_RESPONSE (QUESTION_ID)^
create index IDX_OCAT_INTERVIEW_RESPONSE_ON_INTERVIEW on OCAT_INTERVIEW_RESPONSE (INTERVIEW_ID)^
-- end OCAT_INTERVIEW_RESPONSE
