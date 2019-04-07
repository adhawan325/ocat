alter table OCAT_CW_CASE add constraint FK_OCAT_CW_CASE_ON_CLIENT foreign key (CLIENT_ID) references OCAT_CLIENT(ID);
alter table OCAT_CW_CASE add constraint FK_OCAT_CW_CASE_ON_OWNER foreign key (OWNER_ID) references SEC_USER(ID);
alter table OCAT_CW_CASE add constraint FK_OCAT_CW_CASE_ON_STATUS foreign key (STATUS_ID) references OCAT_CASE_STATUS_CONFIG(ID);
create index IDX_OCAT_CW_CASE_ON_CLIENT on OCAT_CW_CASE (CLIENT_ID);
create index IDX_OCAT_CW_CASE_ON_OWNER on OCAT_CW_CASE (OWNER_ID);
create index IDX_OCAT_CW_CASE_ON_STATUS on OCAT_CW_CASE (STATUS_ID);
