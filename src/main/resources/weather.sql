-- Table: public.weather

-- DROP TABLE IF EXISTS public.weather;

CREATE TABLE IF NOT EXISTS public.weather
(
    id bigint NOT NULL,
    city character varying(255) COLLATE pg_catalog."default" NOT NULL,
    "time" timestamp without time zone NOT NULL,
    temperature character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT weather_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.weather
    OWNER to postgres;