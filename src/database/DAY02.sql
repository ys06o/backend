create database mydb0203;
use mydb0203;

-- [1] 테이블 생성
-- create table 테이블명(속성명 타입 제약조건, 속성명 타입 제약조건) ;
create table test(속성명 int);

-- [2]테이블 목록 보기  -- show tables --
show tables;

create table test5(속성명1 int,속성명2 double);
drop table if exists test;

-- 테이블 조회-- select 속성명1,속성명2 from 테이블명;,
select*from test5;



-- [5]다양한 데이터타입의 테이블 생성
create table test3(
 정수속성1 tinyint,정수속성2 smallint,정수속성3 mediumint,
 정수속성4 int,정수속성5 bigint,정수속성6 int unsigned,
 실수속성1 float,실수속성2 double,실수속성3 decimal, -- 문자타입으로 실수표현(오차x)
 날짜속성 date,시간속성 time,날짜시간속성 datetime,
 문자속성1 char(5), -- 고정길이의 문자타입
 문자속성2 varchar(5), -- 가변길이의 문자타입 ->varchar(5) "유재석->남은 두칸은 삭제
 문자속성3 text,문자속성4 longtext, -- 4G 대용량
 논리속성 bool -- true or false,tinyint 취급, 1또는 0
);
select*from test3;

-- [*] 방문록 기록하는 테이블
create table comment(
content varchar(255), -- 내용 최대 255자
writer varchar(20) -- 작성자 최대 20글자
);
select*from comment;

-- [*] 대기명단을 기록하는 테이블
create table waiting(
count tinyint unsigned, -- 인원수 최대 255명까지!
phone char(13) -- 연락처 최대 13글자 고정길이
);

select*from waiting;



-- [6] 제약조건:테이블내 데이터들의 문제와 결함이 되는 입력 방지/해결
create table test4(
	#속성명 타입 제약조건명
    속성명1 tinyint not null, -- not null이란? 해당 속성값들은 null값을 저장할 수 없다.
    속성명2 smallint unique, 	-- 해당 속성값들은 중복이 불가능하다.
    속성명3 int default 10,   -- default 자료 :만일 해당 속성에 초기값이 생략되면 기본값 자료 사용한다.
    속성명4 bigint auto_increment,  -- auto_increment :만일 해당속성의 초기값이 생략되면 자동번호 부여한다.
	constraint primary key(속성명4)								-- primary key: pk(식별키/기본키), 식별가능한 고유한 값을 가진 키
									-- 중복없음 unique+not null이 기본값으로 들어있음(학번,사번,주민번호 등등) -- vs constraint primay key(pk속성명)
);
select*from test4;
create table test5(
속성명1 bigint,
constraint foreign key(속성명1) references test4(속성명4) on delete set null;
-- foreign key:FK(참조/외래)키,다른 테이블에 기본키(pk)를 참조하는 키-- 중복가능,빈칸가능
 -- pk(1):fk(N)관계에서 수강신청한 학번,휴가신청한사번,구매한 제품번호 등등
-- on update/delete  restrict:pk가 삭제/수정될때 fk가 **참조**중이면 삭제/수정 불가능<자식이 있으면 부모 삭제 불가능>,기본값
-- on update cascade:pk가 삭제/수정 될때 fk필드의 레코드도 같이 삭제 관계,ex)게시물도 지워지면 댓글도 함께 삭제된다.
-- set null:pk가 삭제/수정될때 fk는 null 값으로 자동으로 변경, ex) 게시물삭제되면 댓글 참조는 null
);


-- [5] 회원제 제품 설계
-- 관례적인 순서 
drop database if exists boardService6; -- 이미 존재할수 있으므로 db삭제
create database boardService6; -- 데이터베이스 생성
use boardService6;
create table member(
mno int auto_increment, -- 회원번호,정수타입,자동부여
mid varchar(30) not null unique, -- 회원의 아이디 ,문자타입 30글자, null값 불가능,중복불가능
mpw varchar(30) not null,   -- 회원 비밀번호,문자30글자,빈칸불가능
mname varchar(10) , -- 회원명 ,문자타입(10),빈칸가능
mphone char(13), -- 회원 연락처,문자타입(10)
constraint primary key(mno) -- 회원번호를 pk로 설정
);
select*from memeber;
create table product(
pno int auto_increment , -- 제품번호, 자동부여
pname varchar(100) not null unique,
pprice int unsigned default 0, -- 가격이므로 음수는 필요x, 초기값 생략시 0
pcomment longtext,   -- 최대 4G까지 가능한 문자타입
mno int, -- FK로 사용할 필드명의 타입은 pk의 필드명과 일치명을 권장한다.
pdate datetime default now(),  -- 날짜/시간 타입, 기본값을 현재 시스템 날짜/시간 자동부여
constraint primary key(pno),
constraint foreign key(mno) references member(mno) on delete cascade -- 회원이 탈퇴하면 그회원의 제품도 같이 삭제
);
select*from product;

-- ER다이어그램:여러 테이블 간의 관계를 시각적,ERD 다이어그램:데이터베이스 테이블 간의관계를 시각적
-- 워크밴치 메뉴 상단->[database]