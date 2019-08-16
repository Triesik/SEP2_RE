create database company;

create table sep2.employee
(
    employeeid integer not null
        constraint employee_pkey
            primary key,
    firstname  varchar(255),
    lastname   varchar(255),
    email      varchar(255),
    password   varchar(255),
    usertype   varchar(255)
);

create table sep2.shift
(
    shiftid    integer not null
        constraint shift_pk
            primary key,
    employeeid integer,
    starttime  varchar(5),
    endtime    varchar(5),
    task       varchar(255),
    date       date
);

create table sep2.attendance
(
    attendanceid varchar(30),
    employeeid   integer
        constraint attendance_employee_employeeid_fk
            references sep2.employee,
    startdate    varchar(255),
    enddate      varchar(255),
    starttime    varchar(10),
    endtime      varchar(10)
);

create table sep2.employeestatus
(
    employeeid integer
        constraint employeestatus_employee_employeeid_fk
            references sep2.employee,
    status     varchar(25)
);


