alter table OCAT_INTERVIEW_RESPONSE add constraint FK_OCAT_INTERVIEW_RESPONSE_ON_RESPONSE foreign key (RESPONSE_ID) references OCAT_RESPONSE_TYPE_CONFIG(ID);
create index IDX_OCAT_INTERVIEW_RESPONSE_ON_RESPONSE on OCAT_INTERVIEW_RESPONSE (RESPONSE_ID);
