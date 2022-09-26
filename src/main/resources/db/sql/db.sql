CREATE TABLE INFRASTRUCTURE (
	ID INTEGER PRIMARY KEY
	, NAME VARCHAR(10)
	, REGIST_DATE DATE
);
INSERT INTO INFRASTRUCTURE VALUES(1,'湖あり','2020-01-01');
INSERT INTO INFRASTRUCTURE VALUES(2,'海あり','2020-02-02');
INSERT INTO INFRASTRUCTURE VALUES(3,'空港あり','2020-02-15');
INSERT INTO INFRASTRUCTURE VALUES(4,'電車あり','2020-02-08');

CREATE SEQUENCE PREFECTURE_INFRASTRUCTURE_SEQ;
CREATE TABLE PREFECTURE_INFRASTRUCTURE (
	ID INTEGER DEFAULT nextval('PREFECTURE_INFRASTRUCTURE_SEQ'::regclass) PRIMARY KEY
	--ID INTEGER GENERATED BY DEFAULT AS SEQUENCE PREFECTURE_INFRASTRUCTURE_SEQ PRIMARY KEY
	, INFRASTRUCTURE_ID INTEGER NOT NULL
	, PREFECTURE_ID INTEGER NOT NULL
);

INSERT INTO PREFECTURE_INFRASTRUCTURE (PREFECTURE_ID,INFRASTRUCTURE_ID) VALUES(1,1);
INSERT INTO PREFECTURE_INFRASTRUCTURE (PREFECTURE_ID,INFRASTRUCTURE_ID) VALUES(1,2);
INSERT INTO PREFECTURE_INFRASTRUCTURE (PREFECTURE_ID,INFRASTRUCTURE_ID) VALUES(2,3);
INSERT INTO PREFECTURE_INFRASTRUCTURE (PREFECTURE_ID,INFRASTRUCTURE_ID) VALUES(2,4);


CREATE TABLE SECTION8 (
	ID INTEGER PRIMARY KEY
	, NAME VARCHAR(10)
);
INSERT INTO SECTION8 VALUES(1,'北海道地方');
INSERT INTO SECTION8 VALUES(2,'東北地方');
INSERT INTO SECTION8 VALUES(3,'関東地方');
INSERT INTO SECTION8 VALUES(4,'中部地方');
INSERT INTO SECTION8 VALUES(5,'近畿地方');
INSERT INTO SECTION8 VALUES(6,'中国地方');
INSERT INTO SECTION8 VALUES(7,'四国地方');
INSERT INTO SECTION8 VALUES(8,'九州・沖縄地方');

CREATE TABLE SECTION3 (
	ID INTEGER PRIMARY KEY
	, NAME VARCHAR(10)
);
INSERT INTO SECTION3 VALUES(1,'北日本');
INSERT INTO SECTION3 VALUES(2,'東日本');
INSERT INTO SECTION3 VALUES(3,'西日本');


CREATE TABLE PREFECTURE (
	ID INTEGER PRIMARY KEY
	, NAME VARCHAR(10)
	, POPULATION INTEGER
	, SECTION8_ID INTEGER
	, SECTION3_ID INTEGER
	, IS_GOVERNMENT_DESIGNED_CITY BOOLEAN)
;

INSERT INTO PREFECTURE VALUES(1,'北海道',5352000,1,1,true);
INSERT INTO PREFECTURE VALUES(2,'青森県',1293000,2,1,false);
INSERT INTO PREFECTURE VALUES(3,'岩手県',1268000,2,1,false);
INSERT INTO PREFECTURE VALUES(4,'宮城県',2330000,2,1,true);
INSERT INTO PREFECTURE VALUES(5,'秋田県',1010000,2,1,false);
INSERT INTO PREFECTURE VALUES(6,'山形県',1113000,2,1,false);
INSERT INTO PREFECTURE VALUES(7,'福島県',1901000,2,1,false);
INSERT INTO PREFECTURE VALUES(8,'茨城県',2905000,3,2,false);
INSERT INTO PREFECTURE VALUES(9,'栃木県',1966000,3,2,false);
INSERT INTO PREFECTURE VALUES(10,'群馬県',1967000,3,2,false);
INSERT INTO PREFECTURE VALUES(11,'埼玉県',7289000,3,2,true);
INSERT INTO PREFECTURE VALUES(12,'千葉県',6236000,3,2,true);
INSERT INTO PREFECTURE VALUES(13,'東京都',13624000,3,2,false);
INSERT INTO PREFECTURE VALUES(14,'神奈川県',9145000,3,2,true);
INSERT INTO PREFECTURE VALUES(15,'新潟県',2286000,4,2,false);
INSERT INTO PREFECTURE VALUES(16,'富山県',1061000,4,2,false);
INSERT INTO PREFECTURE VALUES(17,'石川県',1151000,4,2,false);
INSERT INTO PREFECTURE VALUES(18,'福井県',782000,4,2,false);
INSERT INTO PREFECTURE VALUES(19,'山梨県',830000,4,2,false);
INSERT INTO PREFECTURE VALUES(20,'長野県',2088000,4,2,false);
INSERT INTO PREFECTURE VALUES(21,'岐阜県',2022000,4,2,false);
INSERT INTO PREFECTURE VALUES(22,'静岡県',3688000,4,2,true);
INSERT INTO PREFECTURE VALUES(23,'愛知県',7507000,4,2,true);
INSERT INTO PREFECTURE VALUES(24,'三重県',1808000,5,2,false);
INSERT INTO PREFECTURE VALUES(25,'滋賀県',1413000,5,3,false);
INSERT INTO PREFECTURE VALUES(26,'京都府',2605000,5,3,true);
INSERT INTO PREFECTURE VALUES(27,'大阪府',8833000,5,3,true);
INSERT INTO PREFECTURE VALUES(28,'兵庫県',5520000,5,3,true);
INSERT INTO PREFECTURE VALUES(29,'奈良県',1356000,5,3,false);
INSERT INTO PREFECTURE VALUES(30,'和歌山県',954000,5,3,false);
INSERT INTO PREFECTURE VALUES(31,'鳥取県',570000,6,3,false);
INSERT INTO PREFECTURE VALUES(32,'島根県',690000,6,3,false);
INSERT INTO PREFECTURE VALUES(33,'岡山県',1915000,6,3,true);
INSERT INTO PREFECTURE VALUES(34,'広島県',2837000,6,3,true);
INSERT INTO PREFECTURE VALUES(35,'山口県',1394000,6,3,false);
INSERT INTO PREFECTURE VALUES(36,'徳島県',750000,7,3,false);
INSERT INTO PREFECTURE VALUES(37,'香川県',972000,7,3,false);
INSERT INTO PREFECTURE VALUES(38,'愛媛県',1375000,7,3,false);
INSERT INTO PREFECTURE VALUES(39,'高知県',721000,7,3,false);
INSERT INTO PREFECTURE VALUES(40,'福岡県',5104000,8,3,true);
INSERT INTO PREFECTURE VALUES(41,'佐賀県',828000,8,3,false);
INSERT INTO PREFECTURE VALUES(42,'長崎県',1367000,8,3,false);
INSERT INTO PREFECTURE VALUES(43,'熊本県',1774000,8,3,true);
INSERT INTO PREFECTURE VALUES(44,'大分県',1160000,8,3,false);
INSERT INTO PREFECTURE VALUES(45,'宮崎県',1096000,8,3,false);
INSERT INTO PREFECTURE VALUES(46,'鹿児島県',1637000,8,3,false);
INSERT INTO PREFECTURE VALUES(47,'沖縄県',1439000,8,null,false);
