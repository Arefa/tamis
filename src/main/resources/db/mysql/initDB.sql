CREATE DATABASE IF NOT EXISTS teachingassistant;

USE teachingassistant;

CREATE TABLE IF NOT EXISTS users (
  username VARCHAR(50) NOT NULL PRIMARY KEY,
  password VARCHAR(50) NOT NULL,
  enabled BOOLEAN NOT NULL
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS authorities (
  username VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  CONSTRAINT fk_authorities_users FOREIGN KEY (username) REFERENCES users(username)
) engine=InnoDB;

CREATE UNIQUE INDEX ix_auth_username ON authorities (username,authority);

CREATE TABLE IF NOT EXISTS attachment2 (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  course_id VARCHAR(45) NOT NULL,
  course_name VARCHAR(45) NOT NULL,
  course_college VARCHAR(45) NOT NULL,
  course_type1 VARCHAR(45) NOT NULL,
  course_type2 VARCHAR(45) NOT NULL,
  course_credit FLOAT UNSIGNED NOT NULL,
  theory_period INT UNSIGNED NOT NULL,
  experiment_period INT UNSIGNED NOT NULL,
  machine_period INT UNSIGNED NOT NULL,
  total_number_classes INT UNSIGNED NOT NULL,
  total_number_students INT UNSIGNED NOT NULL,
  student_info VARCHAR(45) NOT NULL,
  academic_year VARCHAR(45) NOT NULL,
  term VARCHAR(45) NOT NULL,
  submit_date DATE NOT NULL,
  nbr_of_attend_lecture INT UNSIGNED NOT NULL,
  nbr_of_chk_homework INT UNSIGNED NOT NULL,
  nbr_of_coach INT UNSIGNED NOT NULL,
  nbr_of_exercise INT UNSIGNED NOT NULL,
  nbr_of_exam INT UNSIGNED NOT NULL,
  nbr_of_report INT UNSIGNED NOT NULL,
  nbr_of_discuss INT UNSIGNED NOT NULL,
  nbr_of_thesis INT UNSIGNED NOT NULL,
  nbr_of_reading INT UNSIGNED NOT NULL,
  other_stuff VARCHAR(45) NOT NULL,
  assessment_method VARCHAR(45) NOT NULL,
  usual_percent VARCHAR(45) NOT NULL,
  nbr_of_ta INT UNSIGNED NOT NULL,
  application_reason VARCHAR(255) NOT NULL,
  implementation_measure VARCHAR(255) NOT NULL
) engine=InnoDB;
