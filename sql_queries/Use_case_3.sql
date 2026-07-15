SELECT ct.continent_name,
       SUM(cc.deaths) AS total_deaths
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
INNER JOIN continents ct
ON c.continent_id = ct.continent_id
GROUP BY ct.continent_name;
--Use Case 3: Analyze Deaths by Continent