CREATE TABLE signup (

userid	INTEGER(10) AUTO_INCREMENT,
username varchar(50) not null,
email  varchar(50) not null,
pssword varchar(50) not null,

constraint singup_pk PRIMARY KEY(userid)
);

ALTER table signup auto_increment = 0000000001;