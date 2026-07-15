SELECT c1.report_date,
       c1.confirmed_cases
FROM covid_cases c1
WHERE c1.state_name = 'Mumbai'
AND c1.confirmed_cases =
(
    SELECT MAX(c2.confirmed_cases)
    FROM covid_cases c2
    WHERE c2.state_name = c1.state_name
);

--Use Case 18: Track COVID Waves (Mumbai)