create table users (
    id          bigint auto_increment primary key,
    username    varchar(255) unique not null,
    hash        varchar(255) not null,
    first_name  varchar(255),
    last_name   varchar(255),
    email       varchar(255) unique not null,
    enabled     boolean not null default 0
);

insert into users values (1, 'admin', '$2a$10$U6ghwiKnz/cqOMLAl9hPAOGv9MXo.MrGOs7.t9Hq77n5ejFmP6Yr6',
    'Admin', 'System', 'admin@localhost.localdomain', 1);

insert into users values (2, 'jdoe1', '$2a$10$U6ghwiKnz/cqOMLAl9hPAOGv9MXo.MrGOs7.t9Hq77n5ejFmP6Yr6',
    'John', 'Doe', 'jdoe1@localhost.localdomain', 1);

insert into users values (3, 'jdoe2', '$2a$10$U6ghwiKnz/cqOMLAl9hPAOGv9MXo.MrGOs7.t9Hq77n5ejFmP6Yr6',
    'Jane', 'Doe', 'jdoe2@localhost.localdomain', 1);
