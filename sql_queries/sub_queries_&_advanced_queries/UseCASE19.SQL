SELECT country_id,
       vaccinated_population AS population,
       'Vaccinated' AS status
FROM covid_vaccines

UNION

SELECT country_id,
       unvaccinated_population,
       'Unvaccinated'
FROM covid_vaccines;
--Use Case 19: Compare Vaccination Coverage