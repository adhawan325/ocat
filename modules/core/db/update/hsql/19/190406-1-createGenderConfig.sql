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
);