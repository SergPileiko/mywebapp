USE `employeedb`;

CREATE TABLE employee(
        employee_id BIGSERIAL NOT NULL PRIMARY KEY,
        first_name VARCHAR(50) NOT NULL,
        last_name VARCHAR(50) NOT NULL,
        department_id BIGINT NOT NULL,
        job_title VARCHAR(50) NOT NULL,
        gender VARCHAR(6) NOT NULL,
        date_of_birth DATE NOT NULL
        );
