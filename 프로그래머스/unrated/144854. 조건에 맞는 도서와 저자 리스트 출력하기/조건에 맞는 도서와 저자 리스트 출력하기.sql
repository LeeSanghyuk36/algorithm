-- 코드를 입력하세요
-- SELECT B.BOOK_ID, A.AUTHOR_NAME, B.PUBLISHED_DATE
-- FROM BOOK B JOIN AUTHOR A
-- ON B.AUTHOR_ID = A.AUTHOR_ID
-- WHERE B.CATEGORY = '경제'
-- ORDER BY PUBLISHED_DATE;

SELECT 
b.BOOK_ID AS BOOK_ID,
a.AUTHOR_NAME AS AUTHOR_NAME,
TO_CHAR(b.PUBLISHED_DATE, 'yyyy-mm-dd') AS PUBLISHED_DATE
FROM BOOK b
JOIN AUTHOR a
ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE b.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE
;