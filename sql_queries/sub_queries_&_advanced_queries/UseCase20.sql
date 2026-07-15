SELECT country_id
FROM covid_deaths
WHERE country_id NOT IN
(
    SELECT country_id
    FROM covid_cases
);
--Use Case 20: Find Countries Present in Deaths but Not Cases