set echo on;
set serveroutput on;
drop table bill;
drop table allotted;
drop table uses;
drop table orders;
drop table food;
drop table facilities;
drop table room;
drop table guest;
drop table temp;
create table guest
(
id number(4) constraint pk_guest primary key,
name varchar(10),
address varchar2(40),
phone_no varchar2(10),
no_of_adults number(2),
no_of_children number(2)
);
create table room
(
roomno number(4) constraint pk_room primary key,
type varchar(20) constraint chk_roomtype check(type in ('A/C Suite(Single)','A/C Suite(Double)','A/C Premium(Single)','A/C Premium(Double)','A/C Deluxe(Single)','A/C Deluxe(Double)','Non A/C(Single)','Non A/C(Double)')),
rate number(5) constraint chk_rate check(rate in (12000,13000,9000,10000,6000,7000,3000,4000)),
status varchar2(10) constraint chk_status check(status in ('occupied','unoccupied'))
);
create table allotted
(
roomno number(4) constraint fk_alloted_room references room(roomno),
guestid number(4) constraint fk_alloted_guest references guest(id),
checkindate date,
checkoutdate date,
constraint pk_allotted primary key(roomno,guestid)
);
create table facilities
(
id number(2) constraint pk_facility primary key,
name varchar2(20),
rate number(5)
);
create table uses
(
guestid number(4) constraint fk_uses_guest references guest(id),
facilityid number(2) constraint fk_facility references facilities(id),
quantity number(2),
cost number(7),
constraint pk_uses primary key(guestid,facilityid)
);
create table food
(
id number(2) constraint pk_food primary key,
name varchar2(20),
rate number(5)
);
create table orders
(
guestid number(4) constraint fk_orders_guest references guest(id),
foodid number(2) constraint fk_food references food(id),
quantity number(2),
cost number(7),
constraint pk_orders primary key(guestid,foodid)
);
create table bill
(
billno number(5) constraint pk_bill primary key,
guestid number(4) constraint fk_bill_guest references guest(id),
noofrooms number(2),
totalroomcost number(7),
totalfoodcost number(5),
amount number(8)
);
insert into room values(1,'A/C Suite(Single)',12000,'unoccupied');
insert into room values(2,'A/C Suite(Single)',12000,'unoccupied');
insert into room values(3,'A/C Suite(Single)',12000,'unoccupied');
insert into room values(4,'A/C Suite(Single)',12000,'unoccupied');
insert into room values(5,'A/C Suite(Single)',12000,'unoccupied');
insert into room values(6,'A/C Suite(Double)',13000,'unoccupied');
insert into room values(7,'A/C Suite(Double)',13000,'unoccupied');
insert into room values(8,'A/C Suite(Double)',13000,'unoccupied');
insert into room values(9,'A/C Suite(Double)',13000,'unoccupied');
insert into room values(10,'A/C Suite(Double)',9000,'unoccupied');
insert into room values(11,'A/C Premium(Single)',9000,'unoccupied');
insert into room values(12,'A/C Premium(Single)',9000,'unoccupied');
insert into room values(13,'A/C Premium(Single)',9000,'unoccupied');
insert into room values(14,'A/C Premium(Single)',9000,'unoccupied');
insert into room values(15,'A/C Premium(Single)',9000,'unoccupied');
insert into room values(16,'A/C Premium(Double)',10000,'unoccupied');
insert into room values(17,'A/C Premium(Double)',10000,'unoccupied');
insert into room values(18,'A/C Premium(Double)',10000,'unoccupied');
insert into room values(19,'A/C Premium(Double)',10000,'unoccupied');
insert into room values(20,'A/C Premium(Double)',10000,'unoccupied');
insert into room values(21,'A/C Deluxe(Single)',6000,'unoccupied');
insert into room values(22,'A/C Deluxe(Single)',6000,'unoccupied');
insert into room values(23,'A/C Deluxe(Single)',6000,'unoccupied');
insert into room values(24,'A/C Deluxe(Single)',6000,'unoccupied');
insert into room values(25,'A/C Deluxe(Single)',6000,'unoccupied');
insert into room values(26,'A/C Deluxe(Double)',7000,'unoccupied');
insert into room values(27,'A/C Deluxe(Double)',7000,'unoccupied');
insert into room values(28,'A/C Deluxe(Double)',7000,'unoccupied');
insert into room values(29,'A/C Deluxe(Double)',7000,'unoccupied');
insert into room values(30,'A/C Deluxe(Double)',7000,'unoccupied');
insert into room values(31,'Non A/C(Single)',3000,'unoccupied');
insert into room values(32,'Non A/C(Single)',3000,'unoccupied');
insert into room values(33,'Non A/C(Single)',3000,'unoccupied');
insert into room values(34,'Non A/C(Single)',3000,'unoccupied');
insert into room values(35,'Non A/C(Single)',3000,'unoccupied');
insert into room values(36,'Non A/C(Double)',4000,'unoccupied');
insert into room values(37,'Non A/C(Double)',4000,'unoccupied');
insert into room values(38,'Non A/C(Double)',4000,'unoccupied');
insert into room values(39,'Non A/C(Double)',4000,'unoccupied');
insert into room values(40,'Non A/C(Double)',4000,'unoccupied');
insert into facilities values(1,'Valet',1500);
insert into facilities values(2,'Tea and Coffee',20);
insert into facilities values(3,'Internet',20);
insert into facilities values(4,'Telephone',10);
insert into facilities values(5,'Newspaper',5);
insert into facilities values(6,'Car Services',500);
insert into facilities values(7,'Laundry',40);
insert into facilities values(8,'Bus Services',1500);
insert into facilities values(9,'Parking',500);
insert into facilities values(10,'Beauty Parlour',750);
insert into food values(1,'Lunch',700);
insert into food values(2,'Lunch',700);
insert into food values(3,'Dinner',700);
insert into food values(4,'Cocktail',1000);
insert into food values(5,'Chat',100);

CREATE OR REPLACE PROCEDURE calc_food
(
gt_foodid IN food.id%type,
gt_guestid IN guest.id%type,
gt_quantity IN orders.quantity%type
)
IS
cursor c is
select * from orders where foodid=gt_foodid and guestid=gt_guestid;
c_rec c%rowtype;
cursor c1 is
select rate from food where id=gt_foodid;
gt_rate food.rate%type;
gt_cost orders.cost%type;
BEGIN
open c1;
fetch c1 into gt_rate;
close c1;
open c;
fetch c into c_rec;
if(c%found) then
gt_cost:=(c_rec.quantity+gt_quantity)*gt_rate;
update orders
set quantity=quantity + gt_quantity,cost=gt_cost
where foodid= gt_foodid and guestid= gt_guestid;
ELSE
gt_cost:=gt_quantity*gt_rate;
insert into orders values(gt_guestid,gt_foodid,gt_quantity,gt_cost);
END IF;
close c;
END;
/
CREATE OR REPLACE PROCEDURE calc_service
(
gt_facilityid IN facilities.id%type,
gt_guestid IN guest.id%type,
gt_quantity IN uses.quantity%type
)
IS
cursor c is
select * from uses where facilityid=gt_facilityid and guestid=gt_guestid;
c_rec c%rowtype;
cursor c1 is
select rate from facilities where id=gt_facilityid;
gt_rate facilities.rate%type;
gt_cost uses.cost%type;
BEGIN
open c1;
fetch c1 into gt_rate;
close c1;
open c;
fetch c into c_rec;
if(c%found) then
gt_cost:=(c_rec.quantity+gt_quantity)*gt_rate;
update uses
set quantity=quantity + gt_quantity,cost=gt_cost
where facilityid= gt_facilityid and guestid= gt_guestid;
ELSE
gt_cost:=gt_quantity*gt_rate;
insert into uses values(gt_guestid,gt_facilityid,gt_quantity,gt_cost);
END IF;
close c;
END;
/
create table temp
(
roomno number(4)
);
create or replace procedure check_availability
(
gt_guestid in guest.id%type,
gt_type in room.type%type,
gt_checkin in allotted.checkindate%type,
gt_checkout in allotted.checkoutdate%type,
gt_cnoofrooms in number
)
is
cursor c1 is
Select * from room
where status='unoccupied' and type=gt_type;
begin
if(gt_checkin>gt_checkout) then
raise_application_error(10999,'Checkindate > checkout date!!');
end if;
delete from temp;
for rec in c1
loop
insert into temp values(rec.roomno);
end loop;
end;
/
create or replace procedure food_charges(gid in orders.guestid%type)
is
ret number;
cursor c1
is
Select sum(cost)
from orders
group by guestid
having guestid=gid;
begin
open c1;
fetch c1 into ret;
update bill set totalfoodcost=ret where guestid=gid;
end;
/
create or replace procedure total_charges(gid in guest.id%type)
is
ret number;
cursor c1
is
Select sum(cost)
from uses
group by guestid
having guestid=gid;
ret1 number;
begin
open c1;
fetch c1 into ret;
close c1;
select totalroomcost into ret1 from bill where guestid=gid;
ret:=ret+ret1;
select totalfoodcost into ret1 from bill where guestid=gid;
ret:=ret+ret1;
update bill set amount=ret where guestid=gid;
end;
/
create or replace procedure room_rent(gid in allotted.guestid%type)
is
rec allotted%rowtype;
totrent number;
unitrent room.rate%type;
days number;
cursor c1
is
Select *
from allotted
where guestid=gid;
begin
totrent:=0;
for rec in c1
loop
Select rate into unitrent
from room
where roomno= rec.roomno;
days:=rec.checkoutdate-rec.checkindate;
totrent:=totrent+(unitrent*days);
end loop;
update bill set totalroomcost=totrent where guestid=gid;
end;
/

create or replace procedure before_exit(gid in guest.id%type)
is
ret number;
cursor c is select r.roomno from room r join allotted a on(a.roomno=r.roomno) join guest g on(a.guestid=g.id) where r.status='occupied';
begin
for rec in c
loop
update room
set status='unoccupied'
where roomno=rec.roomno;
end loop;
end;
/
create or replace function noofdays(gid allotted.guestid%type)
return number
is
rec allotted%rowtype;
days number;
cursor c1
is
Select *
from allotted
where guestid=gid;
begin
open c1;
fetch c1 into rec;
close c1;
days:=rec.checkoutdate-rec.checkindate;
return days;
end;
/