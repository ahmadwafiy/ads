create table advertisement(

adsID integer(10) not null,
adsTitle varchar(100) not null,
adsDesc varchar(200) not null,
price varchar(2) not null,
userID integer(10),
constraint adsID_pk PRIMARY KEY(adsID)



);

ALTER table advertisement auto_increment = 0000000001;