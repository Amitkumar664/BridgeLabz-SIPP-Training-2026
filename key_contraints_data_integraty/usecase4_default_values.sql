-- ============================================
-- Session 2: Keys, Constraints & Data Integrity
-- Use Case 4: Set Default Values
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

    PRIMARY KEY (Country, `Date`)
);

-- Insert records without specifying Recoveries and Last_Updated
INSERT INTO covid_cases
(Country, `Date`, Confirmed_Cases, Deaths)
VALUES
('India', '2026-07-20', 500, 10),
('USA', '2026-07-20', 700, 15),
('Japan', '2026-07-20', 300, 5);

-- Display records
SELECT * FROM covid_cases;

-- Insert record with custom Recoveries
INSERT INTO covid_cases
(Country, `Date`, Confirmed_Cases, Recoveries, Deaths)
VALUES
('Australia', '2026-07-21', 400, 350, 8);

-- Display all records
SELECT * FROM covid_cases;