CREATE TABLE usersAds (

userID  integer(10) AUTO_INCREMENT,
passwoord varchar(12) not null,
username  varchar (100) not null,

constraint userID_pk  PRIMARY KEY(userID)

);

ALTER table usersAds auto_increment = 0000000001;