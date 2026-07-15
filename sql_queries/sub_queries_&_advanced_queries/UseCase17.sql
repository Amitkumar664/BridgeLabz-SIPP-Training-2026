SELECT country_name
FROM countries
WHERE country_id IN
(
    SELECT country_id
    FROM covid_cases
    GROUP BY country_id
    HAVING MAX(confirmed_cases) > 1000000
);
--Identify Countries Exceeding Case Threshold