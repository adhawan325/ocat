alter table OCAT_QUESTIONNAIRE add column QUESTION_TEXT longvarchar ;
alter table OCAT_QUESTIONNAIRE add column BEGIN_DATE date ;
alter table OCAT_QUESTIONNAIRE add column NEEDS_TEXT boolean ;
alter table OCAT_QUESTIONNAIRE add column INTERVIEW_SECTION_ID varchar(36) ;
alter table OCAT_QUESTIONNAIRE add column PARENT_ID varchar(36) ;
alter table OCAT_QUESTIONNAIRE add column END_DATE date ;
