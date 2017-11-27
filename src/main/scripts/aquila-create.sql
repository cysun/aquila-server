create table users (
       id bigint not null,
        
		 email varchar(255) not null,
       
		 enabled bit not null,
       
		 first_name varchar(255),
       
		 hash varchar(255) not null,
       
		 last_name varchar(255),
       
		 username varchar(255) not null,
        
		 coiPiNonPHS_Id bigint,
      
		 timelineForm_Id bigint,
       
		 primary key (id)

);

insert into users values(1,'admin@localhost.localdomain',1,'Admin', '$2a$10$U6ghwiKnz/cqOMLAl9hPAOGv9MXo.MrGOs7.t9Hq77n5ejFmP6Yr6',
'System','admin',3,2);

insert into users values(2,'admin@localhost.localdomain',1,'Admin', '$2a$10$U6ghwiKnz/cqOMLAl9hPAOGv9MXo.MrGOs7.t9Hq77n5ejFmP6Yr6',
'System','admin',1,1);

insert into users values(0,'admin@localhost.localdomain',1,'Admin', '$2a$10$U6ghwiKnz/cqOMLAl9hPAOGv9MXo.MrGOs7.t9Hq77n5ejFmP6Yr6',
'System','admin',2,3);

