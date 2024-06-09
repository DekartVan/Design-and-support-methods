-- begin BPMDEMO_CONTRACT
create table BPMDEMO_CONTRACT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER varchar(255) not null,
    DATE date not null,
    STATE varchar(255) not null,
    --
    primary key (ID)
)^
-- end BPMDEMO_CONTRACT
