-- ============================================
-- Session 2: Keys, Constraints & Data Integrity
-- Use Case 5: Prevent Duplicate Country-Date Entries
-- ============================================

-- Create Database
CREATE DATABASE IF NOT EXISTS covid_db;

-- Use Database
USE covid_db;

-- Drop table if it already exists
DROP TABLE IF EXISTS covid_cases;

-- Create covid_cases table
CREATE TABLE covid_cases (
    Country VARCHAR(100) NOT NULL,
    `Date` DATE NOT NULL,
    Confirmed_Cases INT NOT NULL,
    Recoveries INT DEFAULT 0,
    Deaths INT,
    Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT uq_country_date UNIQUE (Country, `Date`)
);

-- Insert valid records
INSERT INTO covid_cases
(Country, `Date`, Confirmed_Cases, Recoveries, Deaths)
VALUES
('India', '2026-07-20', 500, 450, 10),
('USA', '2026-07-20', 700, 650, 15),
('Japan', '2026-07-20', 300, 280, 5);

-- Display records
SELECT * FROM covid_cases;

-- This will generate an error because
-- Country + Date combination already exists
INSERT INTO covid_cases
(Country, `Date`, Confirmed_Cases, Recoveries, Deaths)
VALUES
('India', '2026-07-20', 600, 550, 12);

-- Display records again
SELECT * FROM covid_cases;