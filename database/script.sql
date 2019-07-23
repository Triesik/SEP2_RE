-- SCHEMA: SEP2

-- DROP SCHEMA "SEP2" ;

CREATE SCHEMA "SEP2"
    AUTHORIZATION postgres;
	create table Users (
	               cpr_no int NOT Null, 
				   LastName varchar(255) NOT NULL,
                   FirstName varchar(255),
				   Email varchar(255),
				   mobile_no int,
				   user_type char(1) Default 'E',
				   primary key (cpr_no)
				  );
				  create table Shift (
	               shift_id SERIAL  , 
				   company_name varchar(255) NOT NULL,
                   description  varchar(255),
				   shift_name varchar(255),
	PRIMARY KEY (shift_id)
				  );
				  
create table DateTime( datetime_id SERIAL primary key ,
					  datetime timestamp);
					  
					  
					  
create table Shift_management (
	               shiftmanag_id SERIAL  , 
				   datetime_id int ,
                   cpr_no  int,
				   shift_id int ,
	PRIMARY KEY (shiftmanag_id),
	FOREIGN KEY (datetime_id) REFERENCES DateTime (datetime_id),
	FOREIGN KEY (cpr_no) REFERENCES Users (cpr_no),
	FOREIGN KEY (shift_id) REFERENCES Shift (shift_id)
				  );
				  
				  create table checkin_checkout (
	               check_id SERIAL  , 
                   cpr_no  int,
				   checkin timestamp ,
					  checkout timestamp, 
	PRIMARY KEY (check_id),
	FOREIGN KEY (cpr_no) REFERENCES Users (cpr_no)
				  );
				  
				  
				  create table workdays (
				  Monday char(1),
Tuesday char(1),
Wednesday char(1),
Thursday char(1),
Friday char(1),
Saturday char(1),
Sunday char(1),
cpr_no int,
primary key(cpr_no),
	FOREIGN KEY (cpr_no) REFERENCES Users (cpr_no)
					  );
				  
				  
					  