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
);