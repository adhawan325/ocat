alter table OCAT_CLIENT add constraint FK_OCAT_CLIENT_ON_GENDER foreign key (GENDER_ID) references OCAT_GENDER_CONFIG(ID);
create index IDX_OCAT_CLIENT_ON_GENDER on OCAT_CLIENT (GENDER_ID);
