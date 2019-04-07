-- begin OCAT_CW_CASE
create table OCAT_CW_CASE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLIENT_ID varchar(36) not null,
    OWNER_ID varchar(36),
    STATUS_ID varchar(36),
    --
    primary key (ID)
)^
-- end OCAT_CW_CASE
-- begin OCAT_APPRAISAL
create table OCAT_APPRAISAL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end OCAT_APPRAISAL
-- begin OCAT_RECOMMENDATION
create table OCAT_RECOMMENDATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end OCAT_RECOMMENDATION
-- begin OCAT_QUESTIONNAIRE
create table OCAT_QUESTIONNAIRE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end OCAT_QUESTIONNAIRE
-- begin OCAT_CASE_STATUS_CONFIG
create table OCAT_CASE_STATUS_CONFIG (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONFIG_CODE varchar(255),
    CASE_STATUS varchar(255),
    --
    primary key (ID)
)^
-- end OCAT_CASE_STATUS_CONFIG
-- begin OCAT_GENDER_CONFIG
create table OCAT_GENDER_CONFIG (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONFIG_CODE varchar(255),
    GENDER varchar(255),
    --
    primary key (ID)
)^
-- end OCAT_GENDER_CONFIG
-- begin OCAT_INTERVIEW
create table OCAT_INTERVIEW (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLIENT_ID varchar(36),
    RELATED_CASE_ID varchar(36),
    --
    primary key (ID)
)^
-- end OCAT_INTERVIEW
-- begin OCAT_CLIENT
create table OCAT_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    DATE_OF_BIRTH date,
    CIN varchar(9),
    AUCN varchar(10),
    SSN varchar(15),
    GENDER_ID varchar(36),
    --
    primary key (ID)
)^
-- end OCAT_CLIENT
