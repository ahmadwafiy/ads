create table advertisement(

adsID integer(10) AUTO_INCREMENT,
photo  mediumblob,
category integer,
adsTitle varchar(100) not null,
adsDesc varchar(200) not null,
adsName varchar(100) not null,
price varchar(100) not null,
email varchar(100),
phoneNo varchar(12),
userid	INTEGER(10) not null,

constraint adsID_pk PRIMARY KEY(adsID),
constraint userid_signup_fk FOREIGN KEY (userid) REFERENCES  signup(userid)

);

ALTER table advertisement auto_increment = 0000000001;