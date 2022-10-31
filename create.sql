
    create table dbo.employees (
       id bigint not null,
        email_address varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (id)
    );
create sequence hibernate_sequence start with 1 increment by 1;
