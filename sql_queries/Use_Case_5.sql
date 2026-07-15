SELECT c.country_name,
       c.population,
       cc.confirmed_cases,
       (cc.confirmed_cases * 100.0 / c.population) AS infection_rate
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
ORDER BY infection_rate DESC;
--Use Case 5: Find Countries with Highest Infection Rates