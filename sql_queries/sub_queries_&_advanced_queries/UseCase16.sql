SELECT c.country_name,
       d.total_deaths
FROM covid_deaths d
INNER JOIN countries c
ON d.country_id = c.country_id
WHERE d.total_deaths >
(
    SELECT AVG(total_deaths)
    FROM covid_deaths
);
--Use Case 16: Find Countries with Above-Average Death Counts