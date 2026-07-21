-- ============================================
-- Session 2: Keys, Constraints & Data Integrity
-- Use Case 3: Add Constraints to Ensure Data Quality
-- ============================================

-- Create Database
CREATE DATABASE covid_db;

-- Use Database
USE covid_db;

-- Drop table if it already exists
DROP TABLE IF EXISTS covid_cases;

-- Create covid_cases table with constraints
CREATE TABLE covid_cases (
    Country VARCHAR(100) NOT NULL,
    Report_Date DATE NOT NULL,
    Confirmed_Cases INT NOT NULL,
    Recovered_Cases INT,
    Deaths INT,

    PRIMARY KEY (Country, Report_Date),

    CHECK (Deaths <= Confirmed_Cases)
);

-- Insert valid records
INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Recovered_Cases, Deaths)
VALUES
('India', '2026-07-20', 500, 450, 10),
('USA', '2026-07-20', 700, 650, 15),
('Japan', '2026-07-20', 300, 280, 5);

-- Display records
SELECT * FROM covid_cases;

-- This will generate an error because Deaths > Confirmed_Cases
INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Recovered_Cases, Deaths)
VALUES
('Australia', '2026-07-20', 100, 80, 120);

-- This will generate an error because Confirmed_Cases is NULL
INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Recovered_Cases, Deaths)
VALUES
('Canada', '2026-07-21', NULL, 50, 2);

-- Display records again
SELECT * FROM covid_cases;