-- 코드를 입력하세요
-- SELECT HISTORY_ID,
--     CAR_ID,
--     DATE_FORMAT(START_DATE, '%Y-%M-%D') AS START_DATE
--     DATE_FORMAT(END_DATE, '%Y-%M-%D') AS END_DATE,
--     CASE WHEN DATEDIFF(END_DATE, START_DATE) +1 > 30 THEN '장기 대여'
--     ELSE '단기 대여'
-- FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- WHERE START_DATE LIKE '2022-09%'
-- ORDER BY HISTORY_ID DESC;
SELECT history_id,car_id,to_char(start_date,'yyyy-mm-dd') start_date,
to_char(end_date,'yyyy-mm-dd') end_date,
case when (end_date - start_date)+1 >= 30 then '장기 대여'
else '단기 대여' end rent_type
from car_rental_company_rental_history
where to_char(start_date,'yyyymm') = '202209'
order by history_id desc