create table SAMPLER_COUNTRY_LITRES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNTRY varchar(255) not null,
    LITRES double precision not null,
    --
    primary key (ID)
);