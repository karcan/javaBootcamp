DROP TABLE IF EXISTS company_activation_codes;
DROP TABLE IF EXISTS company_activation_employees;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS companies;
DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS candidates;
DROP TABLE IF EXISTS job_titles;
DROP TABLE IF EXISTS admins;

CREATE TABLE "public"."admins"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"username" varchar(25),
	"password" varchar(25));

CREATE TABLE "public"."candidates"( 
	"user_id" int NOT NULL,
	"first_name" varchar(25) NOT NULL,
	"last_name" varchar(25) NOT NULL,
	"identity_number" varchar(11) NOT NULL,
	"birth_date" date NOT NULL);

CREATE TABLE "public"."companies"( 
	"user_id" int NOT NULL,
	"company_name" varchar(255) NOT NULL,
	"web_address" varchar(50) NOT NULL,
	"phone_number" varchar(12) NOT NULL,
	"is_active" boolean NOT NULL);

CREATE TABLE "public"."company_activation_codes"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"company_id" int NOT NULL,
	"activation_code" varchar(38) NOT NULL,
	"is_confirmed" boolean NOT NULL,
	"confirmed_date" date);

CREATE TABLE "public"."company_activation_employees"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"company_id" int NOT NULL,
	"confirmed_employee_id" int,
	"confirmed_date" date);

CREATE TABLE "public"."employees"( 
	"user_id" int NOT NULL,
	"first_name" varchar(25) NOT NULL,
	"last_name" varchar(25) NOT NULL);

CREATE TABLE "public"."job_titles"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"title" varchar(50) NOT NULL);

CREATE TABLE "public"."users"( 
	"id" int NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
	"email" varchar(50) NOT NULL,
	"password" varchar(25) NOT NULL);
	
ALTER TABLE "public"."admins" ADD CONSTRAINT "pk_admin" PRIMARY KEY ("id");
ALTER TABLE "public"."candidates" ADD CONSTRAINT "pk_candidate" PRIMARY KEY ("user_id");
ALTER TABLE "public"."candidates" ADD CONSTRAINT "uc_identity_numbers" UNIQUE ("identity_number");
ALTER TABLE "public"."companies" ADD CONSTRAINT "pk_company" PRIMARY KEY ("user_id");
ALTER TABLE "public"."company_activation_codes" ADD CONSTRAINT "pk_companyactivationcode" PRIMARY KEY ("id");
ALTER TABLE "public"."company_activation_employees" ADD CONSTRAINT "pk_companyactivationemployee" PRIMARY KEY ("id");
ALTER TABLE "public"."employees" ADD CONSTRAINT "pk_employee" PRIMARY KEY ("user_id");
ALTER TABLE "public"."job_titles" ADD CONSTRAINT "pk_job_titles" PRIMARY KEY ("id");
ALTER TABLE "public"."users" ADD CONSTRAINT "pk_user" PRIMARY KEY ("id");
ALTER TABLE "public"."job_titles" ADD CONSTRAINT "uc_job_titles" UNIQUE ("title");
ALTER TABLE "public"."company_activation_codes" ADD CONSTRAINT "fk_companyactivationcode_company" FOREIGN KEY ("company_id") REFERENCES "public"."companies" ( "user_id");
ALTER TABLE "public"."company_activation_employees" ADD CONSTRAINT "fk_companyactivationemployee_company" FOREIGN KEY ("company_id") REFERENCES "public"."companies" ( "user_id");
ALTER TABLE "public"."users" ADD CONSTRAINT "fk_user_candidate" FOREIGN KEY ("id") REFERENCES "public"."candidates" ( "user_id");
ALTER TABLE "public"."users" ADD CONSTRAINT "fk_user_company" FOREIGN KEY ("id") REFERENCES "public"."companies" ( "user_id");
ALTER TABLE "public"."users" ADD CONSTRAINT "fk_user_employee" FOREIGN KEY ("id") REFERENCES "public"."employees" ( "user_id");
ALTER TABLE "public"."companies" ALTER COLUMN "is_active" SET DEFAULT false;