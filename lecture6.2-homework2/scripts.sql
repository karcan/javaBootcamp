DROP TABLE IF EXISTS company_activation_codes;
DROP TABLE IF EXISTS company_activation_employees;
DROP TABLE IF EXISTS companies;
DROP TABLE IF EXISTS employer_activation_codes;
DROP TABLE IF EXISTS employer_activation_employees;
DROP TABLE IF EXISTS employers;
DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS candidates;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS job_titles;

CREATE TABLE "public"."admins"( 
	"id" int NOT NULL,
	"username" varchar(25),
	"password" varchar(25));

CREATE TABLE "public"."candidates"( 
	"user_id" int NOT NULL,
	"first_name" varchar(25) NOT NULL,
	"last_name" varchar(25) NOT NULL,
	"identity_number" varchar(11) NOT NULL,
	"birth_date" date NOT NULL);

CREATE TABLE "public"."employees"( 
	"user_id" int NOT NULL,
	"first_name" varchar(25) NOT NULL,
	"last_name" varchar(25) NOT NULL);

CREATE TABLE "public"."employers"( 
	"user_id" int NOT NULL,
	"company_name" varchar(255) NOT NULL,
	"web_address" varchar(50) NOT NULL,
	"phone_number" varchar(12) NOT NULL,
	"is_activated" boolean NOT NULL);

CREATE TABLE "public"."employers_activation_codes"( 
	"id" int NOT NULL,
	"employer_user_id" int NOT NULL,
	"activation_code" varchar(38) NOT NULL,
	"is_confirmed" boolean NOT NULL,
	"confirmed_date" date);

CREATE TABLE "public"."employers_activation_employees"( 
	"id" int NOT NULL,
	"employer_user_id" int NOT NULL,
	"confirmed_employee_user_id" int,
	"confirmed_date" date);

CREATE TABLE "public"."job_titles"( 
	"id" int NOT NULL,
	"title" varchar(50) NOT NULL);

CREATE TABLE "public"."users"( 
	"id" int NOT NULL,
	"email" varchar(50) NOT NULL,
	"password" varchar(25) NOT NULL);


CREATE SEQUENCE "public"."employers_activation_codes_id_seq" INCREMENT BY 1 START WITH 1 OWNED BY "public"."employers_activation_codes"."id";
CREATE SEQUENCE "public"."employers_activation_employees_id_seq" INCREMENT BY 1 START WITH 1 OWNED BY "public"."employers_activation_employees"."id";
CREATE SEQUENCE "public"."job_titles_id_seq" INCREMENT BY 1 START WITH 1 OWNED BY "public"."job_titles"."id";
CREATE SEQUENCE "public"."users_id_seq" INCREMENT BY 1 START WITH 1 OWNED BY "public"."users"."id";
ALTER TABLE "public"."admins" ADD CONSTRAINT "pk_admin" PRIMARY KEY ("id");
ALTER TABLE "public"."candidates" ADD CONSTRAINT "pk_candidate" PRIMARY KEY ("user_id");
ALTER TABLE "public"."employees" ADD CONSTRAINT "pk_employee" PRIMARY KEY ("user_id");
ALTER TABLE "public"."employers" ADD CONSTRAINT "pk_company" PRIMARY KEY ("user_id");
ALTER TABLE "public"."employers_activation_codes" ADD CONSTRAINT "pk_companyactivationcode" PRIMARY KEY ("id");
ALTER TABLE "public"."employers_activation_employees" ADD CONSTRAINT "pk_companyactivationemployee" PRIMARY KEY ("id");
ALTER TABLE "public"."job_titles" ADD CONSTRAINT "pk_job_titles" PRIMARY KEY ("id");
ALTER TABLE "public"."users" ADD CONSTRAINT "pk_user" PRIMARY KEY ("id");
ALTER TABLE "public"."candidates" ADD CONSTRAINT "uc_candidates_identity_number" UNIQUE ("identity_number");
ALTER TABLE "public"."job_titles" ADD CONSTRAINT "uc_job_titles_title" UNIQUE ("title");
ALTER TABLE "public"."users" ADD CONSTRAINT "uc_users_email" UNIQUE ("email");
ALTER TABLE "public"."candidates" ADD CONSTRAINT "fk_candidates_users" FOREIGN KEY ("user_id") REFERENCES "public"."users" ( "id");
ALTER TABLE "public"."employees" ADD CONSTRAINT "fk_employees_users" FOREIGN KEY ("user_id") REFERENCES "public"."users" ( "id");
ALTER TABLE "public"."employers" ADD CONSTRAINT "fk_companies_users" FOREIGN KEY ("user_id") REFERENCES "public"."users" ( "id");
ALTER TABLE "public"."employers_activation_codes" ADD CONSTRAINT "fk_company_activation_codes_companies" FOREIGN KEY ("employer_user_id") REFERENCES "public"."employers" ( "user_id");
ALTER TABLE "public"."employers_activation_employees" ADD CONSTRAINT "fk_company_activation_employees_companies" FOREIGN KEY ("employer_user_id") REFERENCES "public"."employers" ( "user_id");
ALTER TABLE "public"."employers_activation_employees" ADD CONSTRAINT "fk_company_activation_employees_employees1" FOREIGN KEY ("confirmed_employee_user_id") REFERENCES "public"."employees" ( "user_id");
ALTER TABLE "public"."employers" ALTER COLUMN "is_activated" SET DEFAULT false;
ALTER TABLE "public"."employers_activation_codes" ALTER COLUMN "id" SET DEFAULT nextval('"public"."employers_activation_codes_id_seq"');
ALTER TABLE "public"."employers_activation_employees" ALTER COLUMN "id" SET DEFAULT nextval('"public"."employers_activation_employees_id_seq"');
ALTER TABLE "public"."job_titles" ALTER COLUMN "id" SET DEFAULT nextval('"public"."job_titles_id_seq"');
ALTER TABLE "public"."users" ALTER COLUMN "id" SET DEFAULT nextval('"public"."users_id_seq"');

INSERT INTO "public"."job_titles"(title) VALUES('Software Developer'),('Software Architect')