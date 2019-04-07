create table OCAT_INTERVIEW_CONFIG (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ITEM_CODE varchar(255),
    ITEM_NAME longvarchar,
    PARENT_ID varchar(36),
    BEGIN_DATE date,
    END_DATE date,
    --
    primary key (ID)
);