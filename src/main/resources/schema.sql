
DROP table if exists car;

CREATE TABLE CAR(
    ID bigint auto_increment,
    model_name varchar(255) not null,
    company_id bigint not null ,
    passenger_capacity int,
    created_at TIMESTAMP NOT NULL ,
    updated_at TIMESTAMP NOT NULL ,

    PRIMARY KEY (ID)
);

Drop table if exists company;

create table COMPANY (
    id bigint auto_increment,
    company_name varchar(255) not null ,
    company_nation varchar(255) not null ,
    created_at timestamp not null ,
    updated_at timestamp not null,

    primary key (id)
);
