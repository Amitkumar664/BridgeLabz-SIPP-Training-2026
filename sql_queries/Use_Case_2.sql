SELECT d.country_id,
       d.report_date,
       d.total_deaths,
       v.vaccination_status
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country_id = v.country_id
AND d.report_date = v.report_date;
--Use Case 2: Join COVID Deaths and Vaccination Data