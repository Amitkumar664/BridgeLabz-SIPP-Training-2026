SELECT report_date,
       AVG(total_deaths) AS average_deaths
FROM covid_deaths
GROUP BY report_date
ORDER BY report_date;
--Use Case 4: Calculate Average New Deaths Per Day