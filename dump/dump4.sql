--
-- PostgreSQL database cluster dump
--

-- Started on 2024-07-17 13:04:10 UTC

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;

--
-- Roles
--

CREATE ROLE hello;
ALTER ROLE hello WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:jb4yUKpn0Ehs3vF+nRnSXA==$gRxIOcExL3Pozj1VQhBiTIzSeX3fsMbH2C705D/AVcw=:A+JxFxrVoYrDtrUhy7gaSqdwVZElaATY7grypT38MBQ=';
CREATE ROLE pompom;
ALTER ROLE pompom WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN NOREPLICATION NOBYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:UBeDR/m/U2ryrE8mbX9KMw==$psYhNym6Ox9WDfKBJyxP8tDo1H8eEvlnCB3tDISaK/0=:Ez4H70JlxcdplBQw2Pze0hfq2yMU1DUJ0imricHGmAQ=';
CREATE ROLE postgres;
ALTER ROLE postgres WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS;

--
-- User Configurations
--








--
-- Databases
--

--
-- Database "template1" dump
--

\c connect template1

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3 (Debian 16.3-1.pgdg120+1)
-- Dumped by pg_dump version 16.3

-- Started on 2024-07-17 13:04:10 UTC

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

-- Completed on 2024-07-17 13:04:11 UTC

--
-- PostgreSQL database dump complete
--

--
-- Database "hello" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3 (Debian 16.3-1.pgdg120+1)
-- Dumped by pg_dump version 16.3

-- Started on 2024-07-17 13:04:11 UTC

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3346 (class 1262 OID 16384)
-- Name: hello; Type: DATABASE; Schema: -; Owner: hello
--

CREATE DATABASE hello WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'en_US.utf8';


ALTER DATABASE hello OWNER TO hello;

\c connect hello

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

-- Completed on 2024-07-17 13:04:11 UTC

--
-- PostgreSQL database dump complete
--

--
-- Database "playgrounddb" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3 (Debian 16.3-1.pgdg120+1)
-- Dumped by pg_dump version 16.3

-- Started on 2024-07-17 13:04:11 UTC

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3388 (class 1262 OID 16387)
-- Name: playgrounddb; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE playgrounddb WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'en_US.utf8';


ALTER DATABASE playgrounddb OWNER TO postgres;

\c connect playgrounddb

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 846 (class 1247 OID 16394)
-- Name: my_composite_type; Type: TYPE; Schema: public; Owner: pompom
--

CREATE TYPE public.my_composite_type AS (
	id integer,
	description text
);


ALTER TYPE public.my_composite_type OWNER TO pompom;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 218 (class 1259 OID 16404)
-- Name: a; Type: TABLE; Schema: public; Owner: pompom
--

CREATE TABLE public.a (
    text text NOT NULL
);


ALTER TABLE public.a OWNER TO pompom;

--
-- TOC entry 217 (class 1259 OID 16396)
-- Name: all_data_types; Type: TABLE; Schema: public; Owner: pompom
--

CREATE TABLE public.all_data_types (
    serial_col integer NOT NULL,
    int_col integer,
    smallint_col smallint,
    bigint_col bigint,
    decimal_col numeric(10,2),
    numeric_col numeric(10,2),
    real_col real,
    double_col double precision,
    money_col money,
    char_col character(10),
    varchar_col character varying(255),
    text_col text,
    bytea_col bytea,
    date_col date,
    time_col time without time zone,
    timetz_col time with time zone,
    timestamp_col timestamp without time zone,
    timestamptz_col timestamp with time zone,
    interval_col interval,
    boolean_col boolean,
    point_col point,
    line_col line,
    lseg_col lseg,
    box_col box,
    path_col path,
    polygon_col polygon,
    circle_col circle,
    cidr_col cidr,
    inet_col inet,
    macaddr_col macaddr,
    uuid_col uuid,
    json_col json,
    jsonb_col jsonb,
    xml_col xml,
    array_col integer[],
    composite_col public.my_composite_type
);


ALTER TABLE public.all_data_types OWNER TO pompom;

--
-- TOC entry 216 (class 1259 OID 16395)
-- Name: all_data_types_serial_col_seq; Type: SEQUENCE; Schema: public; Owner: pompom
--

CREATE SEQUENCE public.all_data_types_serial_col_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.all_data_types_serial_col_seq OWNER TO pompom;

--
-- TOC entry 3390 (class 0 OID 0)
-- Dependencies: 216
-- Name: all_data_types_serial_col_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: pompom
--

ALTER SEQUENCE public.all_data_types_serial_col_seq OWNED BY public.all_data_types.serial_col;


--
-- TOC entry 219 (class 1259 OID 16411)
-- Name: data; Type: TABLE; Schema: public; Owner: pompom
--

CREATE TABLE public.data (
    id integer NOT NULL,
    datarelatedsomethingid text
);


ALTER TABLE public.data OWNER TO pompom;

--
-- TOC entry 220 (class 1259 OID 16418)
-- Name: datarelatedsomething; Type: TABLE; Schema: public; Owner: pompom
--

CREATE TABLE public.datarelatedsomething (
    datarelatedsomethingid text NOT NULL,
    somethingid text
);


ALTER TABLE public.datarelatedsomething OWNER TO pompom;

--
-- TOC entry 221 (class 1259 OID 16425)
-- Name: something; Type: TABLE; Schema: public; Owner: pompom
--

CREATE TABLE public.something (
    somethingid text NOT NULL,
    somethingvalue character varying(255)
);


ALTER TABLE public.something OWNER TO pompom;

--
-- TOC entry 3223 (class 2604 OID 16399)
-- Name: all_data_types serial_col; Type: DEFAULT; Schema: public; Owner: pompom
--

ALTER TABLE ONLY public.all_data_types ALTER COLUMN serial_col SET DEFAULT nextval('public.all_data_types_serial_col_seq'::regclass);


--
-- TOC entry 3379 (class 0 OID 16404)
-- Dependencies: 218
-- Data for Name: a; Type: TABLE DATA; Schema: public; Owner: pompom
--

COPY public.a (text) FROM stdin;
pompo
\.


--
-- TOC entry 3378 (class 0 OID 16396)
-- Dependencies: 217
-- Data for Name: all_data_types; Type: TABLE DATA; Schema: public; Owner: pompom
--

COPY public.all_data_types (serial_col, int_col, smallint_col, bigint_col, decimal_col, numeric_col, real_col, double_col, money_col, char_col, varchar_col, text_col, bytea_col, date_col, time_col, timetz_col, timestamp_col, timestamptz_col, interval_col, boolean_col, point_col, line_col, lseg_col, box_col, path_col, polygon_col, circle_col, cidr_col, inet_col, macaddr_col, uuid_col, json_col, jsonb_col, xml_col, array_col, composite_col) FROM stdin;
1	1	2	1234567890123456789	1234.56	1234.56	1.23	1.23456789	$1,234.56	char10    	varchar255	Some text	\\xdeadbeef	2024-07-15	12:34:56	12:34:56+00	2024-07-15 12:34:56	2024-07-15 12:34:56+00	1 year 2 mons 3 days	t	(1,2)	{1,-1,0}	[(0,0),(1,1)]	(1,1),(0,0)	[(0,0),(1,1)]	((0,0),(1,1),(0,1))	<(1,1),1>	192.168.1.0/24	192.168.1.1	08:00:2b:01:02:03	123e4567-e89b-12d3-a456-426614174000	{"key": "value"}	{"key": "value"}	<foo>bar</foo>	{1,2,3}	(1,example)
2	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N
3	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	\N	{"key":"value"}	\N	\N	\N	\N
\.


--
-- TOC entry 3380 (class 0 OID 16411)
-- Dependencies: 219
-- Data for Name: data; Type: TABLE DATA; Schema: public; Owner: pompom
--

COPY public.data (id, datarelatedsomethingid) FROM stdin;
1	100A
2	101B
\.


--
-- TOC entry 3381 (class 0 OID 16418)
-- Dependencies: 220
-- Data for Name: datarelatedsomething; Type: TABLE DATA; Schema: public; Owner: pompom
--

COPY public.datarelatedsomething (datarelatedsomethingid, somethingid) FROM stdin;
100A	200X
101B	201Y
\.


--
-- TOC entry 3382 (class 0 OID 16425)
-- Dependencies: 221
-- Data for Name: something; Type: TABLE DATA; Schema: public; Owner: pompom
--

COPY public.something (somethingid, somethingvalue) FROM stdin;
200X	Value 1
201Y	Value 2
\.


--
-- TOC entry 3391 (class 0 OID 0)
-- Dependencies: 216
-- Name: all_data_types_serial_col_seq; Type: SEQUENCE SET; Schema: public; Owner: pompom
--

SELECT pg_catalog.setval('public.all_data_types_serial_col_seq', 3, true);


--
-- TOC entry 3227 (class 2606 OID 16410)
-- Name: a a_pkey; Type: CONSTRAINT; Schema: public; Owner: pompom
--

ALTER TABLE ONLY public.a
    ADD CONSTRAINT a_pkey PRIMARY KEY (text);


--
-- TOC entry 3225 (class 2606 OID 16403)
-- Name: all_data_types all_data_types_pkey; Type: CONSTRAINT; Schema: public; Owner: pompom
--

ALTER TABLE ONLY public.all_data_types
    ADD CONSTRAINT all_data_types_pkey PRIMARY KEY (serial_col);


--
-- TOC entry 3229 (class 2606 OID 16417)
-- Name: data data_pkey; Type: CONSTRAINT; Schema: public; Owner: pompom
--

ALTER TABLE ONLY public.data
    ADD CONSTRAINT data_pkey PRIMARY KEY (id);


--
-- TOC entry 3231 (class 2606 OID 16424)
-- Name: datarelatedsomething datarelatedsomething_pkey; Type: CONSTRAINT; Schema: public; Owner: pompom
--

ALTER TABLE ONLY public.datarelatedsomething
    ADD CONSTRAINT datarelatedsomething_pkey PRIMARY KEY (datarelatedsomethingid);


--
-- TOC entry 3233 (class 2606 OID 16431)
-- Name: something something_pkey; Type: CONSTRAINT; Schema: public; Owner: pompom
--

ALTER TABLE ONLY public.something
    ADD CONSTRAINT something_pkey PRIMARY KEY (somethingid);


--
-- TOC entry 3389 (class 0 OID 0)
-- Dependencies: 3388
-- Name: DATABASE playgrounddb; Type: ACL; Schema: -; Owner: postgres
--

GRANT ALL ON DATABASE playgrounddb TO pompom;


-- Completed on 2024-07-17 13:04:11 UTC

--
-- PostgreSQL database dump complete
--

--
-- Database "postgres" dump
--

\connect postgres

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3 (Debian 16.3-1.pgdg120+1)
-- Dumped by pg_dump version 16.3

-- Started on 2024-07-17 13:04:11 UTC

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

-- Completed on 2024-07-17 13:04:11 UTC

--
-- PostgreSQL database dump complete
--

-- Completed on 2024-07-17 13:04:11 UTC

--
-- PostgreSQL database cluster dump complete
--

