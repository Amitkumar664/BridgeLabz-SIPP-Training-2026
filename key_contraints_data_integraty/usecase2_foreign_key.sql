-- ============================================
-- Session 2: Keys, Constraints & Data Integrity
-- Use Case 2: Create Foreign Key Relationships
-- ============================================

-- Create Database
CREATE DATABASE covid_db;

-- Use Database
USE covid_db;

-- Drop tables if they already exist
DROP TABLE IF EXISTS covid_cases;
DROP TABLE IF EXISTS countries;

-- Create countries reference table
CREATE TABLE countries (
    Country_ID INT AUTO_INCREMENT PRIMARY KEY,
    Country_Name VARCHAR(100) NOT NULL UNIQUE,
    Continent VARCHAR(50),
    Population BIGINT
);

-- Insert sample country data
INSERT INTO countries (Country_Name, Continent, Population)
VALUES
('India', 'Asia', 1430000000),
('USA', 'North America', 339000000),
('Japan', 'Asia', 124000000),
('Australia', 'Australia', 27000000);

-- Create covid_cases table
CREATE TABLE covid_cases (
    Country VARCHAR(100) NOT NULL,
    Report_Date DATE NOT NULL,
    Confirmed_Cases INT,
    Recovered_Cases INT,
    Deaths INT,

    PRIMARY KEY (Country, Report_Date),

    CONSTRAINT fk_country
    FOREIGN KEY (Country)
    REFERENCES countries(Country_Name)
);

-- Insert valid COVID records
INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Recovered_Cases, Deaths)
VALUES
('India', '2026-07-20', 500, 450, 10),
('USA', '2026-07-20', 700, 650, 15),
('Japan', '2026-07-20', 300, 280, 5);

-- Display records
SELECT * FROM countries;
SELECT * FROM covid_cases;

-- This will generate an error because 'Brazil'
-- does not exist in the countries table.
INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Recovered_Cases, Deaths)
VALUES
('Brazil', '2026-07-20', 400, 350, 8);

-- Display data again
SELECT * FROM covid_cases;