-- ============================================
-- Session 2: Keys, Constraints & Data Integrity
-- Use Case 1: Define Primary Keys in COVID Tables
-- ============================================

-- Create Database
CREATE DATABASE covid_db;

-- Use Database
USE covid_db;

-- Drop table if it already exists
DROP TABLE IF EXISTS covid_cases;

-- Create covid_cases table
CREATE TABLE covid_cases (
    Country VARCHAR(100) NOT NULL,
    Report_Date DATE NOT NULL,
    Confirmed_Cases INT,
    Recovered_Cases INT,
    Deaths INT,

    PRIMARY KEY (Country, Report_Date)
);

-- Insert Sample Records
INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Recovered_Cases, Deaths)
VALUES
('India', '2026-07-20', 500, 450, 10),
('India', '2026-07-21', 520, 470, 12),
('USA', '2026-07-20', 700, 650, 15),
('Japan', '2026-07-20', 300, 280, 5);

-- Display all records
SELECT * FROM covid_cases;

-- This statement will produce an error
-- because Country + Report_Date already exists.
INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Recovered_Cases, Deaths)
VALUES
('India', '2026-07-20', 600, 550, 15);

-- Display records again
SELECT * FROM covid_cases;